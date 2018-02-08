/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.repository.PetRepository;
import com.lmig.ci.pch.repository.PetTypeRepository;
import com.lmig.ci.pch.service.DatabaseService;

/**
 * @author n0129947
 *
 */
@Service
public class DatabaseServiceImpl implements DatabaseService{

	@Autowired
	private PetTypeRepository petTypeRepository;
	
	@Autowired
	private PetRepository petRepository;

	//TODO add methods
	
	/* (non-Javadoc)
	 * @see com.lmig.ci.pch.service.DatabaseService#savePet(com.lmig.ci.pch.domain.Pet)
	 */
	@Override
	public void savePet(Pet pet) {
		petRepository.save(pet);		
	}

	/* (non-Javadoc)
	 * @see com.lmig.ci.pch.service.DatabaseService#findByPetChipTag(java.lang.String)
	 */
	@Override
	public Pet findByPetChipTag(String petChipTag) {
		return petRepository.findByPetChipTag(petChipTag);
	}
	
}
