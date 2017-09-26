package com.rabbit.ssm.controller.aspect;

import com.rabbit.ssm.common.annotation.EXHandle;
import com.rabbit.ssm.common.log.MyLogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//import org.apache.log4j.Logger;

@Aspect
@Component
public class ExceptionHandleAspect {

    @Pointcut("within(com.rabbit.ssm.controller..*)&&@annotation(xh)")
    public void performance(EXHandle xh) {
    }

    @AfterThrowing(throwing = "ex", pointcut = "performance(xh)")
    public void AfterThrowing(JoinPoint jp, Throwable ex, EXHandle xh) {
        Class declaringType = jp.getSignature().getDeclaringType();
        String methodName = jp.getSignature().getName();
//        Logger logger = LoggerFactory.getLogger(declaringType);
//        Logger errlogger = LoggerFactory.getLogger("dailyErrLog");

//        logger.info(xh.desc());
//        logger.error(MessageFormat.format("Method : {0}, Err : ", methodName), ex);
//        errLogger.error("Method : {}, Err : {}", methodName, ex.getMessage(), ex);

        MyLogger.inf(declaringType, xh.desc());
        MyLogger.err("Method : {}, Err : {}", methodName, ex.getMessage(), ex);
//        Object args[] = jp.getArgs();
//        for (int i = 0; i < args.length; i++) {
//            if (args[i] instanceof Test) {
//                Test params = (Test) args[i];
//                System.out.println("param name===" + params.getName());
//            }
//        }

    }


}
