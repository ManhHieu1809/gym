package com.demo.WebsiteGym.api;

import com.demo.WebsiteGym.Entity.User;
import com.demo.WebsiteGym.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
    @RestController
    @RequestMapping("/api/users")
    public class UserController {

        @Autowired
        private UserService userService;

        @GetMapping
        public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable("id") String userId) {
            return userService.getUserById(userId)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }

        @PutMapping("/{id}")
        public ResponseEntity<User> updateUser(@PathVariable("id") String userId, @RequestBody User userDetails) {
            return ResponseEntity.ok(userService.updateUser(userId, userDetails));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteUser(@PathVariable("id") String userId) {
            userService.deleteUser(userId);
            return ResponseEntity.noContent().build();
        }
    }

