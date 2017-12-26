package sample.springmvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        model.addAttribute("greeting", "Sample Spring MVC application with Java Configuration");
        return "home";
    }
}
