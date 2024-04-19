package com.dgmf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/login")
    public String goToLoginPage(
            @RequestParam String name, ModelMap modelMap
    ) {
        modelMap.put("name", name);

        System.out.println("Request Param is : " + name);
        logger.debug("Request Param at Debug Level is : {}", name);
        logger.info("Request Param at Info Level is : {}", name);
        logger.warn("Request Param at Warn Level is : {}", name);


        return "login";
    }
}
