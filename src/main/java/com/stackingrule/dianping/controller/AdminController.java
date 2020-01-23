package com.stackingrule.dianping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("/admin/admin")
@RequestMapping("/admin/admin")
public class AdminController {

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/admin/admin/index");

        return modelAndView;
    }
}
