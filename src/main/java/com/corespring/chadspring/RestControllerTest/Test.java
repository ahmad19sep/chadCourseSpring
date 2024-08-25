package com.corespring.chadspring.RestControllerTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class Test {

    @GetMapping("/HelloWorld")
    public String HelloWorld() {
        return "Hello World";
    }
}
