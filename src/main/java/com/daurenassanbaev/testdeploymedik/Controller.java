package com.daurenassanbaev.testdeploymedik;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/test")
@Slf4j
@CrossOrigin(origins = "*")
public class Controller {
    @PostMapping
    public void doSomething(@RequestBody Object test) {
        log.info(test.toString());
    }
}
