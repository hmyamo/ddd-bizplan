package com.jpworkstyle.bizplan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TopController {

    @GetMapping
    public String index(Model model) {
        String appName = "BizPlan";
        model.addAttribute("appName", appName);
        return "index";
    }

}
