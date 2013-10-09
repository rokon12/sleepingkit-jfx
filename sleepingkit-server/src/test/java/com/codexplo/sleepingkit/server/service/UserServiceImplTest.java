package com.codexplo.sleepingkit.server.service;

import org.junit.runner.RunWith;
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
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testSave() throws Exception {

    }

    @org.junit.Test
    public void testFindById() throws Exception {

    }
}
