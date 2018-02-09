/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 9, 2018
 */

package com.lmig.ci.pch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lmig.ci.pch.domain.PetStatus;

/**
 * @author n0263892
 *
 */

	@Repository
	public interface PetStatusRepository extends JpaRepository<PetStatus, Integer> {

	}

