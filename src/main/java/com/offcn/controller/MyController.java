package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MyController {

    @RequestMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("username","xiaobai");
        return "加载成功";
    }

    @RequestMapping("/get")
    public String getSession(HttpSession session){
        return (String) session.getAttribute("username");
    }
}
