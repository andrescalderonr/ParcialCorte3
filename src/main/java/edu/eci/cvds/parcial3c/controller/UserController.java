package edu.eci.cvds.parcial3c.controller;

import edu.eci.cvds.parcial3c.modelo.User;
import edu.eci.cvds.parcial3c.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


}
