package wali.springboot.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping({"","/","home","home.html"})
    public  String home()
    {
        return "home";
    }
}
