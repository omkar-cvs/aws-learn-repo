package com.oks.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aws/white/belt/emp")
public class EmpController {

    @GetMapping("/welcome")
    public String welcome(){
        return  "Welcome to aws white belt! " ;
    }
}
