/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lmig.ci.pch.domain.Location;
import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.PetStatus;
import com.lmig.ci.pch.domain.PetType;
import com.lmig.ci.pch.domain.User;
import com.lmig.ci.pch.repository.LocationRepository;
import com.lmig.ci.pch.repository.PetRepository;
import com.lmig.ci.pch.repository.PetTypeRepository;
import com.lmig.ci.pch.repository.UserRepository;
import com.lmig.ci.pch.service.DatabaseService;

/**
 * @author n0129947
 *
 */
@Service
public class DatabaseServiceImpl implements DatabaseService {

    @Autowired
    private PetTypeRepository petTypeRepository;

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private LocationRepository locationRepository;

    // TODO add methods

    /*
     * (non-Javadoc)
     * 
     * @see com.lmig.ci.pch.service.DatabaseService#savePet(com.lmig.ci.pch.domain.Pet)
     */
    @Override
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
    
    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.lmig.ci.pch.service.DatabaseService#findByPetChipTag(java.lang.String)
     */
    @Override
    public Pet findByPetChipTag(String petChipTag) {
        return petRepository.findByPetChipTag(petChipTag);
    }

    /* (non-Javadoc)
     * @see com.lmig.ci.pch.service.DatabaseService#allPets()
     */
    @Override
    public List<Pet> findAllPets() {
        return petRepository.findAll();
    }

	/* (non-Javadoc)
	 * @see com.lmig.ci.pch.service.DatabaseService#findAllPetLocations()
	 */
	@Override
	public List<Location> findAllPetLocations() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.lmig.ci.pch.service.DatabaseService#selectPetType(com.lmig.ci.pch.domain.PetType)
	 */
	@Override
	public PetType selectPetType(PetType petType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lmig.ci.pch.service.DatabaseService#selectPetStatus(com.lmig.ci.pch.domain.PetStatus)
	 */
	@Override
	public PetStatus selectPetStatus(PetStatus petStatus) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
