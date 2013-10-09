package com.codexplo.sleepingkit.server.service;

import com.codexplo.sleepingkit.common.domain.User;
import org.springframework.stereotype.Component;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 7:07 PM
 */

@Component
public interface UserService {
    public void save(User user);

    public User findById(int id);

}
