package com.user.advice;

import com.user.exception.MyException;
import com.user.pojo.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(MyException.class)
    public ResponseEntity<ExceptionResult> handleException(MyException e){
        return  ResponseEntity.status(e.getExceptionEnum().getCode()).
                body(new ExceptionResult(e.getExceptionEnum()));
    }
}
