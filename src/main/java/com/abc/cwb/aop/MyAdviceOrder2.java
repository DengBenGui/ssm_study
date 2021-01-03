package com.abc.cwb.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdviceOrder2 {

    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 执行前日志，参数校验 order = 2");
    }

    public void afterReturning(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 返回建议  order = 2");
    }

    public void afterThrowing(JoinPoint joinPoint, Throwable e){
        System.out.println(joinPoint.getSignature().getName() + " 异常  order = 2");
    }

    public void after(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " 执行之后  order = 2");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result;
        System.out.println(joinPoint.getSignature().getName() + "环绕-before  order = 2");
        result = joinPoint.proceed();
        System.out.println(joinPoint.getSignature().getName() + "环绕-after  order = 2");
        return result;
    }
}
