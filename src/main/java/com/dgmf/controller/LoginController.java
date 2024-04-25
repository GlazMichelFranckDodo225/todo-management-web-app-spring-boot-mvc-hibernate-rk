package com.dgmf.controller;

import com.dgmf.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequiredArgsConstructor
// To keep "name" Attribute available along all the Session
// into the LoginController
@SessionAttributes("name")
public class LoginController {
    private final AuthenticationService authenticationService;

    // To Handle GET Request
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    // To Handle POST Request
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String goToWelcomePage(
            @RequestParam("name") String name,
            @RequestParam("password") String password,
            ModelMap modelMap) {
        modelMap.put("name", name);
        modelMap.put("password", password);

        if(authenticationService.authenticate(name, password)) {
            // Authentication
            // Name ==> John Doe | Password ==> dummy
            return "welcome";
        }

        modelMap.put("errorMessage", "Invalid Credentials. Please Try Again.");

        return "login";
    }
}
