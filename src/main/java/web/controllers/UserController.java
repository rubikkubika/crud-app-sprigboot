package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {
    @GetMapping(value = "/users")
    public String usersManagment(ModelMap model) {
        return "users";
    }
}
