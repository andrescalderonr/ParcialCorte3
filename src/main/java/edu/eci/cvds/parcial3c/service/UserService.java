package edu.eci.cvds.parcial3c.service;

import edu.eci.cvds.parcial3c.modelo.User;
import edu.eci.cvds.parcial3c.repository.UserRepository;
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


    public Optional<User> getUserById(String id)  {
        return userRepository.findById(id);
    }


    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }



    public User createUser(User user) {
        if (user.getName() == null || user.getCedula() == null || user.getCorreo() == null) {
            user.setName(null);
            user.setCorreo(null);
            user.setCedula(null);
        }
        if (userRepository.findByEmail(user.getCorreo()).isPresent()) {
            user.setName(null);
            user.setCorreo(null);
            user.setCedula(null);
        } else {
            user.setName(user.getName());
            user.setCorreo(user.getCorreo());
            user.setCedula(user.getCedula());
            return userRepository.save(user);
        }
        return user;
    }
}
