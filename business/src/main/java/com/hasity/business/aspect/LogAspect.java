package com.hasity.business.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Slf4j
@Aspect
@Component
public class LogAspect {


    /*
    * 加一个构造函数，debug时判断这个类是否被加载*/
    public LogAspect() {
        log.info("LogAspect init");
    }

    @Pointcut("execution(public * com.hasity..*Controller.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("前置通知"); //2
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("环绕通知开始"); //1
        Object proceed = proceedingJoinPoint.proceed();
        log.info("环绕通知结束"); // 3
        return proceed;
    }
    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("后置通知"); // 4
    }

}
