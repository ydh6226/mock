package com.example.mock;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/wait")
    public String wait(@RequestParam Long time) throws InterruptedException {
        UUID uuid = UUID.randomUUID();
        log.info("[{}] μμ. time: {}", uuid, time);
        Thread.sleep(time);
        log.info("[{}] κΈ°μ", uuid);
        return "OK";
    }
}
