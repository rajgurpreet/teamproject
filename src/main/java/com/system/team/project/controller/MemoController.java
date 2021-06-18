package com.system.team.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {

    @RequestMapping("memo")
    public void home() {
        System.out.println("This is memo page");
    }
}
