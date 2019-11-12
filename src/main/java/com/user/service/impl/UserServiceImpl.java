package com.user.service.impl;

import com.user.mapper.UsertableMapper;
import com.user.pojo.Usertable;
import com.user.pojo.UsertableExample;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsertableMapper usertableMapper;

    @Override
    public List<Usertable> login(Usertable usertable) {
        //创建查询条件
        UsertableExample example = new UsertableExample();
        UsertableExample.Criteria criteria = example.createCriteria();
        //用户名相等
        criteria.andUnameEqualTo(usertable.getUname());
        //密码相等
        criteria.andUpwdEqualTo(usertable.getUpwd());
        //根据查询条件查询
        List<Usertable> list = usertableMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<Usertable> showList() {
        List<Usertable> list = usertableMapper.showList();
        return list;
    }

    @Override
    public Usertable selectById(Integer ucode) {
        Usertable user = usertableMapper.selectByPrimaryKey(ucode);
        return user;
    }

    @Override
    public void deleteById(Integer ucode) {
        usertableMapper.deleteByPrimaryKey(ucode);
    }

    @Override
    public void update(Usertable usertable) {
        //先检查用户名是否重复
        checkUser(usertable.getUname());
        usertableMapper.updateByPrimaryKey(usertable);
    }

    @Override
    public void insert(Usertable usertable) {
        //先检查用户名是否重复
        checkUser(usertable.getUname());
        usertableMapper.insert(usertable);
    }

    private void checkUser(String uname){
        //创建查询条件
        UsertableExample example = new UsertableExample();
        //条件为用户名等于uname
        example.createCriteria().andUnameEqualTo(uname);
        //取到查询结果
        Usertable user = usertableMapper.selectByExample(example).get(0);
        //如不为空则用户名已存在
        if (user != null){
            throw new RuntimeException("用户名已存在");
        }
    }

}
