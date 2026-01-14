package FlatM8.controller;

import FlatM8.model.LoginRequest;
import FlatM8.model.User;
import FlatM8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }
}
