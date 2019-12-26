package com.stackingrule.dianping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/*
*Created by Stackingrule 2019.12.16
 */

@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    @RequestBody
    public String test() {
        return "test";
    }
}
