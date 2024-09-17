package com.jobportal.Job.Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jobportal.Job.Project.dto.LoginRequest;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView showLoginPage(@RequestParam(value = "error", required = false) String error) {
        ModelAndView modelAndView = new ModelAndView("login");

        modelAndView.addObject("loginRequest", new LoginRequest());

        if (error != null) {
            modelAndView.addObject("error", "Incorrect Password. Please try again 🙂.");
        }
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView loginUser(@ModelAttribute("loginRequest") LoginRequest loginRequest) {

        if (loginRequest.getEmail().equals("aakash@gmail.com") && loginRequest.getPassword().equals("aakash123")) {
            return new ModelAndView("redirect:/home");
        } else {
            return new ModelAndView("redirect:/login?error=true");
        }
    }
}