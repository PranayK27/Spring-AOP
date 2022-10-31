package com.pranay.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.pranay.springaop.service.EmployeeService.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeAllMethods() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }

    @Before("execution(* com.pranay.springaop.service.EmployeeService.getEmployeeById(..))")
    public void logBeforeGetEmployee(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeGetEmployee() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }

    @Before("execution(* com.pranay.springaop.service.EmployeeService.addEmployee(..))")
    public void logBeforeAddEmployee(JoinPoint joinPoint) {
        LOGGER.info("****LoggingAspect.logBeforeCreateEmployee() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }

    @After("execution(* com.pranay.springaop.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint)
    {
        LOGGER.info("****LoggingAspect.logAfterAllMethods() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }

    @After("execution(* com.pranay.springaop.service.EmployeeService.getEmployeeById(..))")
    public void logAfterGetEmployee(JoinPoint joinPoint)
    {
        LOGGER.info("****LoggingAspect.logAfterGetEmployee() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }

    @After("execution(* com.pranay.springaop.service.EmployeeService.addEmployee(..))")
    public void logAfterAddEmployee(JoinPoint joinPoint)
    {
        LOGGER.info("****LoggingAspect.logAfterCreateEmployee() : ");
        LOGGER.info(joinPoint.getSignature().getName());
    }
}
