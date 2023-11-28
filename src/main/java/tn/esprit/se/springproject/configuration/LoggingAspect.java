package tn.esprit.se.springproject.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before(value = "execution(* tn.esprit.se.springproject.services.BlocService.*(..))")
    public void logMethodEntryBefore(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterReturning(value = "execution(* tn.esprit.se.springproject.services.BlocService.*(..))")
    public void logMethodEntryAR(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @AfterThrowing(value = "execution(* tn.esprit.se.springproject.services.BlocService.*(..))")
    public void logMethodEntryAT(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }@After(value = "execution(* tn.esprit.se.springproject.services.BlocService.*(..))")
    public void logMethodEntryAfter(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

}