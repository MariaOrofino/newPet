/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 12, 2018
 */

package com.lmig.ci.pch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lmig.ci.pch.domain.Location;



/**
 * @author n0263892
 *
 */
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
