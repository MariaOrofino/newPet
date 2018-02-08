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

import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.PetType;
import com.lmig.ci.pch.repository.PetRepository;
import com.lmig.ci.pch.repository.PetTypeRepository;

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
	private PetTypeRepository petTypeRepository;
	
	@Test
	public void petTest(){
		
		Pet pet = new Pet();
		pet.setPetName("Rover");
		pet.setPetDesc("Big black dog");
		pet.setPetChipTag("myChipTag");
		pet.setPetSize("Large");
		pet.setPetColor("Black");	
		
		// check that we do not have an id set yet
		Assert.assertTrue(pet.getPetId() == null);
		
		//save the pet to the database
		petRepository.save(pet);
		
        // check that what was saved got an id
        Assert.assertTrue(pet.getPetId() != null);
        
        //find a pet by chip tag and verify if it matches
        Pet foundPet = petRepository.findByPetChipTag("myChipTag");
        Assert.assertEquals(pet.getPetId(), foundPet.getPetId());
		
	}
	
}
