/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 12, 2018
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

import com.lmig.ci.pch.domain.Location;
import com.lmig.ci.pch.domain.Pet;

/**
 * @author n0263892
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unit-test")
public class LocationRepository {
	
	@Autowired
	private LocationRepository locationRepository;
	
	@Test
	public void locationTest(){
		Location location = new Location();
		location.setLocDesc("it's a great description");
		location.setLocInd("y");
		

		
		// check that we do not have an id set yet
		Assert.assertTrue(Location.getLocId() == null);
		
		//save the pet to the database
		locationRepository.save(location);
		
        // check that what was saved got an id
        Assert.assertTrue(location.getLocId() != null);
        
       
		
	}

	/**
	 * @param location
	 */
	private void save(Location location) {
		// TODO Auto-generated method stub
		
	}
	
		
	}
