package com.example.EventManagement.Service;
import com.example.EventManagement.Model.User;
import com.example.EventManagement.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public String save(User user) {
        System.out.println("s"+user);
        userRepository.save(user);
        return "register success";
    }
    public boolean existsByName(String name) {
        return userRepository.findByName(name) !=null;
      }
}