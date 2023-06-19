package com.rest.controller;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.rest.exception.IdNotFoundException;
import com.rest.model.User;
import com.rest.model.UserTemp;
import com.rest.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveuser")
    public ResponseEntity<User> addUser(@Valid @RequestBody UserTemp userTemp){
        User user= userService.saveUser(userTemp);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
    @GetMapping("/getuser/{id}")
    public ResponseEntity<User> getUser(@Valid @PathVariable @Positive(message="id greater than zero")  Integer id) throws IdNotFoundException {
        User user=userService.getUserBtId(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        List<User> users= userService.getAllUsers();
//        List<User> user=users.stream().filter(u->u.getName().equals("vikas")).collect(Collectors.toList());
//         user.remove(user);
        return  users;
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUserById(id);
    }

}
