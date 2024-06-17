package tw.jimwayneyeh.example.springcache_with_aspectj.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Slf4j
@Aspect
public class MyAspect {
    @Before("execution(* tw.jimwayneyeh.example.springcache_with_aspectj.MyRunner.*(..))")
    public void beforeMyRunner() {
        log.info("Before runner");
    }

    @After("execution(* tw.jimwayneyeh.example.springcache_with_aspectj.MyRunner.*(..))")
    public void afterMyRunner() {
        log.info("After runner");
    }
}
