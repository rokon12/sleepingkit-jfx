package com.codexplo.sleepingkit.server.controller;

import com.codexplo.sleepingkit.server.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 6:50 PM
 */
@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;



}
