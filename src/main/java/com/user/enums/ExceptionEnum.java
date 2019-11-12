package com.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    UNAME_OR_UPWD_NOT_MUCH(404,"用户名或密码错误!"),
    LOGIN_MORE_THAN_1(500,"登录异常")
    ;
    private int code;
    private String msg;

}
