package com.rabbit.ssm.common.exception.lifepay;


import com.rabbit.ssm.common.exception.CommonException;
import com.rabbit.ssm.common.result.CommonErrorMessage;

public class LifePayException extends CommonException {
    public LifePayException(CommonErrorMessage message) {
        super(message);
    }
}
