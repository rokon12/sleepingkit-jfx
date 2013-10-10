package com.codexplo.sleepingkit.server.service;

import com.codexplo.sleepingkit.common.domain.User;
import com.codexplo.sleepingkit.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 7:08 PM
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
