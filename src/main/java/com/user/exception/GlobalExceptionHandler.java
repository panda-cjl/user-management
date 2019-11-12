//package com.user.exception;
//
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class GlobalExceptionHandler implements HandlerExceptionResolver {
//
//    @Override
//    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("msg", ex.getMessage());
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
//}
