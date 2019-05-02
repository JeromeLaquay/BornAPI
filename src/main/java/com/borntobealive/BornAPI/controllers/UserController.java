package com.borntobealive.BornAPI.controllers;

import com.borntobealive.BornAPI.entities.User;
import com.borntobealive.BornAPI.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    public UserController(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.POST, value="users", produces={MediaType.APPLICATION_JSON_VALUE}, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> create(@RequestBody User user) {
        try{
            User user2 = userService.createOrUpdate(user);
            return new ResponseEntity<>(user2, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="users")
    public List<User> get() {
        return userService.getAll();
    }
}
