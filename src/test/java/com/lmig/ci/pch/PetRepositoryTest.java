/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
 */

package com.lmig.ci.pch;


import java.util.List;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
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
//clears the db after each test
@Rollback(true)
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
	 location.setLocName("locName");
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

	@Test
	public void deletePetTest() {

		Pet pet = new Pet();
		pet.setPetName("Rover");
		pet.setPetDesc("Big black dog");
		pet.setPetChipTag("5678");
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
		location.setLocName("locName");
		locationRepository.save(location);
		pet.setLocation(location);

		petRepository.save(pet);

		Pet nothaPet = new Pet();
		nothaPet.setPetName("Rover");
		nothaPet.setPetDesc("Big black dog");
		nothaPet.setPetChipTag("123456");
		nothaPet.setPetSize("Large");
		nothaPet.setPetColor("Black");

		PetType nothaPetType = new PetType();
		nothaPetType.setPetSpecies("test");
		petTypeRepository.save(nothaPetType);
		nothaPet.setPetType(nothaPetType);

		User nothaUser = new User();
		nothaUser.setUserFirstName("Bill");
		nothaUser.setUserLastName("William");
		nothaUser.setUserLogin("PetLover");
		nothaUser.setUserState("ny");
		nothaUser.setUserMobile("5165551212");
		nothaUser.setUserEmail("petUser@petuser.com");
		nothaUser.setUserCity("New York");
		nothaUser.setUserZip("11050");
		userRepository.save(nothaUser);
		nothaPet.setUser(nothaUser);

		PetStatus nothaPetStatus = new PetStatus();
		nothaPetStatus.setPetStatus("Lost");
		petStatusRepository.save(nothaPetStatus);
		nothaPet.setPetStatus(nothaPetStatus);

		Location nothaLocation = new Location();
		nothaLocation.setLocDesc("the backyard");
		nothaLocation.setLocState("NY");
		nothaLocation.setLocInd("y");
		nothaLocation.setLocName("nothaLocName");
		locationRepository.save(nothaLocation);
		nothaPet.setLocation(nothaLocation);

		petRepository.save(nothaPet);

		List<Pet> petList = petRepository.findAll();

		//assert that there are 2 pets
		Assert.assertEquals(2, petList.size());

		// delete pet
		petRepository.delete(nothaPet);

		//assert that there is now only uno
		petList = petRepository.findAll();
		Assert.assertEquals(1, petList.size());

//		 check that we do not have a user2 set anymore in the database
		 Assert.assertTrue(petRepository.findOne(nothaPet.getPetId()) ==
		 null);
		

		 
	}
//	@Test
//	public void updatePetTest() {
//
//		Pet pet = new Pet();
//		pet.setPetName("Rover");
//		pet.setPetDesc("Big black dog");
//		pet.setPetChipTag("5678");
//		pet.setPetSize("Large");
//		pet.setPetColor("Black");
//
//		PetType petType = new PetType();
//		petType.setPetSpecies("test");
//		petTypeRepository.save(petType);
//		pet.setPetType(petType);
//
//		User user = new User();
//		user.setUserFirstName("Bill");
//		user.setUserLastName("William");
//		user.setUserLogin("PetLover");
//		user.setUserState("ny");
//		user.setUserMobile("5165551212");
//		user.setUserEmail("petUser@petuser.com");
//		user.setUserCity("New York");
//		user.setUserZip("11050");
//		userRepository.save(user);
//		pet.setUser(user);
//
//		PetStatus petStatus = new PetStatus();
//		petStatus.setPetStatus("Lost");
//		petStatusRepository.save(petStatus);
//		pet.setPetStatus(petStatus);
//
//		Location location = new Location();
//		location.setLocDesc("the backyard");
//		location.setLocState("NY");
//		location.setLocInd("y");
//		locationRepository.save(location);
//		pet.setLocation(location);
//
//		petRepository.save(pet);
//		
//		 

	
}


/*
 * todo update pet
 */