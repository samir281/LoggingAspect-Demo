package com.example.demo.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingAspect {

	@Pointcut("execution(public * com.example.demo.*.*(..))")
	private void publicMethodsFromLoggingPackage() {
	}

    @Around("publicMethodsFromLoggingPackage")
    public Object logInputOutput(ProceedingJoinPoint jointPoint) throws Throwable {
        log.info("Method Starts...{}",jointPoint.getSignature());
        Object processed=jointPoint.proceed();
        log.info("Method ends...{}",jointPoint.getSignature());
        return processed;
    }

}
