package com.jobportal.Job.Project.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String home(Model model) {
        List<String> ourCourses = Arrays.asList(
            "Data Analysis",
            "Web Development",
            "Data Science",
            "Graphics Designer",
            "Frontend Developer"
        );

        model.addAttribute("OurCourses", ourCourses);
        return "home"; 
    }
    @GetMapping("/home")
    public String showHomePage(Model model) {
        return home(model);
    }
}