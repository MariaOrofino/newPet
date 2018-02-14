/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 8, 2018
 */

package com.lmig.ci.pch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.ci.pch.domain.Location;
import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.PetStatus;

/**
 * @author n0129947
 *
 */
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

	Pet findByPetChipTag(String petChipTag);
	Pet findByPetRabiesTag(String petRabiesTag);
	Pet findByLocation(Location location);
//	Pet updateStatus (PetStatus petStatus);
	}
	
