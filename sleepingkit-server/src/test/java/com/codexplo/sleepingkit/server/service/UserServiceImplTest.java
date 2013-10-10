package com.codexplo.sleepingkit.server.service;

import com.codexplo.sleepingkit.common.domain.User;
import junit.framework.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 7:09 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext*.xml")
@Transactional
@Configurable
public class UserServiceImplTest {

    private static final String FIRST_NAME = "first";
    private static final String LAST_NAME = "last";
    private static final String DISPLAY_NAME = "display_name";
    private static final int AGE = 24;
    private static final String EMAIL_ADDRESS = "firstlast@email.com";
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";
    public static final String SEX = "notfoudn";


    @Autowired
    private UserService userService;

    private User user;

    @org.junit.Before
    public void setUp() throws Exception {
        user = new User();
        user.setFirstName(FIRST_NAME);
        user.setLastName(LAST_NAME);
        user.setDisplayName(DISPLAY_NAME);
        user.setEmail(EMAIL_ADDRESS);
        user.setAge(AGE);
        user.setUserName(USER_NAME);
        user.setPassword(PASSWORD);
        user.setSex(SEX);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        userService.delete(user);
    }

    @org.junit.Test
    public void testSave() throws Exception {
        User user1 = userService.save(user);
        Assert.assertEquals(user1, user);
    }

    @org.junit.Test
    public void testFindById() throws Exception {
        User user1 = userService.findById(user.getId());
        Assert.assertNotNull(user1);
    }
}
