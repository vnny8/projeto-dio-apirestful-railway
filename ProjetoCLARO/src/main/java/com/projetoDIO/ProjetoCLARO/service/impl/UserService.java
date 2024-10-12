package com.projetoDIO.ProjetoCLARO.service.impl;

import com.projetoDIO.ProjetoCLARO.models.User;
import com.projetoDIO.ProjetoCLARO.repository.UserRepository;
import com.projetoDIO.ProjetoCLARO.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).
                orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This user already exists");
        }
        return userRepository.save(user);
    }
}
