package com.user.controller;

import com.user.enums.ExceptionEnum;
import com.user.exception.MyException;
import com.user.pojo.Usertable;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户Controller
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("toList")
    public String toList(){
        return "userList";
    }

/*    @PostMapping("login")
    public String login(Usertable usertable, Model model, HttpSession session){
        //根据用户密码查询数据库
        List<Usertable> list = userService.login(usertable);
        //如查询结果大于1抛出异常
        if (list.size()>1){
            throw new RuntimeException("登录异常");
        }
        //如查询不到则抛出用户名或密码错误
        if (CollectionUtils.isEmpty(list)){
            throw new RuntimeException("用户名或密码错误");
        }
        model.addAttribute("list", list);
        //拿到登录的信息
        Usertable user = list.get(0);
        //设置密码为空再传进session
        user.setUpwd(null);
        //传给session
        session.setAttribute("userLogin", user);
        return "userList";
    }*/

    @PostMapping("login")
    @ResponseBody
    public ResponseEntity<Usertable> login(Usertable usertable, HttpSession session){
        //根据用户密码查询数据库
        List<Usertable> list = userService.login(usertable);
        //如查询结果大于1抛出异常
        if (list.size()>1){
            throw new MyException(ExceptionEnum.LOGIN_MORE_THAN_1);
        }
        //如查询不到则抛出用户名或密码错误
        if (CollectionUtils.isEmpty(list)){
            throw new MyException(ExceptionEnum.UNAME_OR_UPWD_NOT_MUCH);
        }
        //拿到登录的信息
        Usertable user = list.get(0);
        //设置密码为空再传进session
        user.setUpwd(null);
        //传给session
        session.setAttribute("userLogin", user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @RequestMapping("showList")
    @ResponseBody
    public List<Usertable> showList(){
        List<Usertable> list = userService.showList();
        return list;
    }

    @RequestMapping("toAdd")
    public String toAdd(HttpSession session){
        Usertable user = (Usertable) session.getAttribute("userLogin");
        if (user.getUtype() != 1){
            throw new RuntimeException("权限不足");
        }
        return "user";
    }

    @RequestMapping("toUpdate/{ucode}")
    public String toUpdate(@PathVariable Integer ucode, Model model, HttpSession session){
        //判断权限
        checkType(session, ucode);
        Usertable user = userService.selectById(ucode);
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping("save")
    public String save(Usertable user, HttpSession session){
        //判断权限
        checkType(session, user.getUcode());
        if(user.getUtype()==null){
            user.setUtype(0);
        }
        if (user.getUcode() != null && user.getUcode()>0){
            Usertable userLogin = (Usertable) session.getAttribute("userLogin");
            if (userLogin.getUtype() != 1){
                user.setUtype(0);
            }
            userService.update(user);
        }else{
            userService.insert(user);
        }
        return "redirect:/toList";
    }

    @RequestMapping("delete/{ucode}")
    public String deleteById(@PathVariable Integer ucode, HttpSession session){
        //判断权限
        checkType(session, ucode);
        userService.deleteById(ucode);
        return "redirect:/toList";
    }

    @RequestMapping("toInfo/{ucode}")
    public String info(@PathVariable Integer ucode,Model model){
        Usertable user = userService.selectById(ucode);
        //设置密码为空
        user.setUpwd(null);
        model.addAttribute("user", user);
        return "info";
    }

    private void checkType(HttpSession session, Integer ucode){
        //取到session里的user
        Usertable user = (Usertable) session.getAttribute("userLogin");
        //如果登录的为普通用户
        if (user.getUtype() != 1){
            //如果修改的不是自己的信息
            if (!user.getUcode().equals(ucode)){
                throw new RuntimeException("权限不足");
            }
            //如果登录的为管理员
        }else if (user.getUtype() == 1){
            //如果修改的是自己的信息
            if (user.getUcode().equals(ucode)){
                throw new RuntimeException("无法修改自己的信息");
            }
        }
    }

}
