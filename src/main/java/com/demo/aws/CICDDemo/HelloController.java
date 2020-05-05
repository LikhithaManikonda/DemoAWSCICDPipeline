package com.demo.aws.CICDDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
    String helloMethod() {
        return "HelloWorld";
    }

}
