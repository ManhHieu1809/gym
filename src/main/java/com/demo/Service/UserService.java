package com.demo.WebsiteGym.Service;

import com.demo.WebsiteGym.Entity.User;
import com.demo.WebsiteGym.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String userId, User userDetails) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUserName(userDetails.getUserName());
        user.setEmail(userDetails.getEmail());
        user.setAge(userDetails.getAge());
        user.setFullName(userDetails.getFullName());
        user.setUserPassword(userDetails.getUserPassword());
        // Các trường khác nếu cần
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }
}
