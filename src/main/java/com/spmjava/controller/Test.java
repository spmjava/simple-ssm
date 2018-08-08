package com.spmjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 齐伟超
 * @date 2018-01-08 15:23
 * @since 1.0.0
 **/
@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("test")
    public String test(){
        return "test";
    }
}
