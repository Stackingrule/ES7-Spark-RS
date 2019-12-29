package com.stackingrule.dianping.controller;

import com.stackingrule.dianping.common.CommonRes;
import com.stackingrule.dianping.model.UserModel;
import com.stackingrule.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/*
*Created by Stackingrule 2019.12.16
 */

@Controller("/user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }

    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name="id") Integer id) {
        UserModel userModel = userService.getUser(id);
        return CommonRes.create(userModel);
    }
}
