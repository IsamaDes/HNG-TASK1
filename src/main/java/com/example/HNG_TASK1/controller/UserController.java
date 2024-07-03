package com.example.HNG_TASK1.controller;
import com.example.HNG_TASK1.model.User;
import com.example.HNG_TASK1.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public ResponseEntity<User> greeting(@RequestParam(name = "visitor_name") String visitor_name, HttpServletRequest request){
        return userService.greetings(visitor_name, request);
    }

}
