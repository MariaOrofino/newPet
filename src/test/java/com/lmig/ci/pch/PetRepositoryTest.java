/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
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
import com.lmig.ci.pch.domain.PetStatus;
import com.lmig.ci.pch.domain.PetType;
import com.lmig.ci.pch.domain.User;
import com.lmig.ci.pch.repository.LocationRepository;
import com.lmig.ci.pch.repository.PetRepository;
import com.lmig.ci.pch.repository.PetStatusRepository;
import com.lmig.ci.pch.repository.PetTypeRepository;
import com.lmig.ci.pch.repository.UserRepository;

/**
 * @author n0129947
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unit-test")
public class PetRepositoryTest {

	@Autowired
	private PetRepository petRepository;

	@Autowired
	private PetTypeRepository petTypeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PetStatusRepository petStatusRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Test
	public void petTest(){
		
		Pet pet = new Pet();
		pet.setPetName("Rover");
		pet.setPetDesc("Big black dog");
		pet.setPetChipTag("myChipTag");
		pet.setPetSize("Large");
		pet.setPetColor("Black");
		
		PetType petType = new PetType();
		petType.setPetSpecies("test");
		petTypeRepository.save(petType);
		pet.setPetType(petType);
	    
		User user = new User();
		user.setUserFirstName("Bill");
		user.setUserLastName("William");
		user.setUserLogin("PetLover");
		user.setUserState("ny");
		user.setUserMobile("5165551212");
		user.setUserEmail("petUser@petuser.com");
		user.setUserCity("New York");
		user.setUserZip("11050");
		userRepository.save(user);
		pet.setUser(user);
		
		PetStatus petStatus = new PetStatus();
		petStatus.setPetStatus("Lost");
		petStatusRepository.save(petStatus);
		pet.setPetStatus(petStatus);
		
		Location location = new Location();
		location.setLocDesc("the backyard");
		location.setLocState("NY");
		location.setLocInd("y");
		locationRepository.save(location);
		pet.setLocation(location);
		

		
		// check that we do not have an id set yet
		Assert.assertTrue(pet.getPetId() == null);
		
		//save the pet to the database
		petRepository.save(pet);
		

        // check that what was saved got an id
        Assert.assertTrue(pet.getPetId() != null);

        // find a pet by chip tag and verify if it matches
        Pet foundPet = petRepository.findByPetChipTag("myChipTag");
        Assert.assertEquals(pet.getPetId(), foundPet.getPetId());

    }

}
