package com.abc.cwb.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyAspect {

    @Pointcut("execution(* com.abc.cwb.service.*.*(..))")
    public void getPointcut(){}

    @Before("getPointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("aspect before " + joinPoint.getSignature().getName());
    }

    @Around("getPointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("aspect around-before " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("aspect around-after " + pjp.getSignature().getName());
        return result;
    }

    @AfterThrowing(pointcut = "getPointcut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println("aspect afterThrowing " + joinPoint.getSignature().getName()+ "  " + e.getMessage());
    }

    @AfterReturning("getPointcut()")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("aspect afterReturning " + joinPoint.getSignature().getName());
    }

    @After("getPointcut()")
    public void after(JoinPoint joinPoint){
        System.out.println("aspect after " + joinPoint.getSignature().getName());
    }

}
