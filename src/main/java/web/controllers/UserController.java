package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserServiceImpl;

import java.util.List;

@Controller
public class UserController {
    private UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getAllUser(ModelMap model) {
        List<User> userList = userService.getAllUser();
        model.addAttribute("users", userList);
        return "users";
    }

    @GetMapping(value = "newUser")
    public String createUser(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "formNewUser";
    }

    @PostMapping()
    public String createUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(ModelMap modelMap, @PathVariable("id") long id) {
        modelMap.addAttribute("user", userService.getUserById(id));
        return "editUser";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") long id) {
        userService.update(id, user.getName(),user.getSurname());
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id) {
        userService.deleteByID(id);
        return "redirect:/";
    }

}
