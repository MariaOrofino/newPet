/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 8, 2018
 */

package com.lmig.ci.pch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.ci.pch.domain.Pet;

/**
 * @author n0129947
 *
 */
@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {

	Pet findByPetChipTag(String petChipTag);
}