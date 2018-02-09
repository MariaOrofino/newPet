/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.service;

import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.User;

/**
 * @author n0129947
 *
 */
public interface DatabaseService {

	void savePet(Pet pet);
	Pet findByPetChipTag(String petChipTag);
	/**
	 * @param user
	 */
	void saveUser(User user);
}
