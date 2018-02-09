/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 9, 2018
 */

package com.lmig.ci.pch;

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
	public void userTest(){
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


		
	}
