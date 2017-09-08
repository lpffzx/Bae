package com.rabbit.ssm.controller.exceptionhandle;


import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler({CommonException.class})
    @ResponseBody
    public CommonResult HandleCommonException(CommonException e) {
        return CommonResult.failed(e.getCode(), e.getMessage());
    }

}
