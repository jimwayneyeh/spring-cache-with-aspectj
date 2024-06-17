package tw.jimwayneyeh.example.springcache_with_aspectj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Slf4j
@Component
public class MyRunner implements CommandLineRunner {
    private static final SecureRandom RANDOM = new SecureRandom();
    @Override
    public void run(String... args) throws Exception {
        log.info("Running...");
        Thread.sleep(500 + RANDOM.nextInt(500));
        log.info("Completed...");
    }
}
