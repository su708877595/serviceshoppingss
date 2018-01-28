package com.hotdeploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by syh on 2017/12/4.
 */
@Controller
@RequestMapping("/index")
public class hotDeployController {
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sya(HttpServletRequest request){
        request.setAttribute("say","hello deploy");
        return "syh";
    }
}
