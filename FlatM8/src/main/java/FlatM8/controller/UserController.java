package FlatM8.controller;

import FlatM8.model.User;
import FlatM8.repository.UserRepository;
import FlatM8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    private UserRepository userRepository;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/{userId}")
    public Optional<User> getUser(@PathVariable String userId) {
        return userService.getUser(UUID.fromString(userId));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

}