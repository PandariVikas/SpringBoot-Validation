package com.cjss.controller;

import com.cjss.model.UserModel;
import com.cjss.service.UserService;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    List<UserModel> addProductsDetails(@Valid @RequestBody UserModel userModel) {
        List<UserModel> users = userService.adduser(userModel);
        return  users;
    }
    @GetMapping("/getallusers")
    private List<UserModel> getAll() {
        return userService.getAll();
    }

    @GetMapping("/getuser/{id}")
    private List<UserModel> getProduct(@PathVariable int id) {
        return userService.getById(id);
    }



    @DeleteMapping("/deleteuser/{id}")
    List<UserModel> delete(@PathVariable int id) {
        return userService.deleteById(id);
    }
}
