package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class HelloController {
    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {

        return "index";
    }

}