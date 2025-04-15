// service/UserService.java
package com.example.demo.UserRepository.UserService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.User.User;
import com.example.demo.UserRepository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // GET all users
    public List<User> getAllUsers() {
        return (List<User>) repo.findAll(); // cast required if using CrudRepository
    }

    // GET user by ID
    public Optional<User> getUserById(Integer id) {
        return repo.findById(id);
    }

    // CREATE new user
    public User createUser(User user) {
        return repo.save(user);
    }

    // UPDATE user
    public User updateUser(Integer id, User userDetails) {
        User user = repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userDetails.getName());
        user.setEmail(userDetails.getEmail());
        return repo.save(user);
    }

    // DELETE user
    public void deleteUser(Integer id) {
        repo.deleteById(id);
    }
}
