package com.pca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qihao on 2020/9/1.
 */
@RestController
public class DemoController {

    @GetMapping(value = "/check")
    public String healthyCheck(){
        return "ok";
    }

}
