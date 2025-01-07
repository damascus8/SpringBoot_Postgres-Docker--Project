package com.docker.Sid.DataSaver.Controller;

import com.docker.Sid.DataSaver.DTO.User;
import com.docker.Sid.DataSaver.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/userapi/")
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/tester")
    public String tester() {
    return "WORKING ....";
    }

     @PostMapping("/add-user")
    public ResponseEntity<User> addUser(@RequestBody User userObject)
    {
        return userService.addUser(userObject);
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }

}
