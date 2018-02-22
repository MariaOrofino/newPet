/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.service;

import java.util.List;

import com.lmig.ci.pch.domain.Location;
import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.PetStatus;
import com.lmig.ci.pch.domain.PetType;
import com.lmig.ci.pch.domain.User;

/**
 * @author n0129947
 *
 */
public interface DatabaseService {

	Pet savePet(Pet pet);
	Pet findByPetChipTag(String petChipTag);
	Location saveLocation(Location location);
	List<Pet> findAllPets();
	List<Location>findAllPetLocations();
	PetType selectPetType(PetType petType);
	PetStatus selectPetStatus(PetStatus petStatus);
	
	void saveUser(User user);
}
