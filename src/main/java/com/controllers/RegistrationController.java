package com.controllers;

import com.domain.Role;
import com.domain.User;
import com.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {

    private UserRepo userRepo;
    @GetMapping(name = "/registration")
    public String registration(){
        return "registration";
    }
    @PostMapping(name = "registration")
    public String addUser(User user, Map<String, Object> model){
       User userFromDB = userRepo.findByName(user.getName());
       if(userFromDB != null){
           model.put("product", "User exists");
           return "registration";
       }
       user.setRoles(Collections.singleton(Role.USER));
       userRepo.save(user);
        return"redirect:/login";
    }
}
