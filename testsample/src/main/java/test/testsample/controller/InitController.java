package test.testsample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InitController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello K8S");
        return "hello";
    }

}
