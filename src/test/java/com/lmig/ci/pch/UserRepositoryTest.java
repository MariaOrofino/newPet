/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 9, 2018
 */

package com.lmig.ci.pch;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmig.ci.pch.domain.User;
import com.lmig.ci.pch.repository.UserRepository;

/**
 * @author n0263892
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unit-test")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userTest() {
        User user = new User();
        user.setUserFirstName("firstName");
        user.setUserLastName("lastName");
        user.setUserLogin("coolLogin");
        user.setUserCity("Emerald City");
        user.setUserState("NH");
        user.setUserMobile("6035551212");
        user.setUserEmail("maria.yakkey@libertymutual.com");
        user.setUserZip("11050");

        // check that we do not have an id set yet
        Assert.assertTrue(user.getUserId() == null);

        userRepository.save(user);

        // check that what was saved got an id
        Assert.assertTrue(user.getUserId() != null);

    }

    @Test
    public void userDeleteTest() {
        User user = new User();
        user.setUserFirstName("Bill");
        user.setUserLastName("Saunders");
        user.setUserLogin("coolLogin");
        user.setUserCity("Emerald City");
        user.setUserState("NH");
        user.setUserMobile("6035551212");
        user.setUserEmail("william.saunders@libertymutual.com");
        user.setUserZip("03820");

        userRepository.save(user);

        User user2 = new User();
        user2.setUserFirstName("firstName");
        user2.setUserLastName("lastName");
        user2.setUserLogin("coolLogin");
        user2.setUserCity("Emerald City");
        user2.setUserState("NH");
        user2.setUserMobile("6035551212");
        user2.setUserEmail("maria.yakkey@libertymutual.com");
        user2.setUserZip("11050");

        userRepository.save(user2);

        List<User> userList = userRepository.findAll();

        // check to see if there are 2 users. Have with 3, not sure where State-wi user is coming from!!
        Assert.assertEquals(2, userList.size());

        // delete user
        userRepository.delete(user2);

        // check that we do not have a user2 set anymore
        Assert.assertTrue(user2.getUserId() == null);
        Assert.assertEquals(1, userList.size());

    }
}

