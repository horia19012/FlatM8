package FlatM8.service;

import FlatM8.model.LoginRequest;
import FlatM8.model.User;
import FlatM8.repository.UserRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUser(UUID userId) {
        return userRepository.findById(userId);
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public @Nullable List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    public ResponseEntity<User> login(LoginRequest loginRequest) {
        User foundUser = this.userRepository.findByUsername(loginRequest.getUsername());
        if (foundUser == null) {
            return ResponseEntity.notFound().build();
        }
        if (foundUser.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok(foundUser);
        }
        return ResponseEntity.notFound().build();
    }
}
