/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.service.DatabaseService;

import io.swagger.annotations.ApiOperation;

/**
 * @author n0129947
 *
 */
@RestController
@RequestMapping("/api/v1/pet")
public class PetController {

	@Autowired
	private DatabaseService databaseService;

	//TODO decide if you need a controller for each domain object
	//TODO have your methods here call your service which calls your dao
	@ApiOperation(value = "Save Pet", response = Pet.class)
	@PostMapping(value="/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pet createPet(@RequestBody Pet pet) {        
        
        return databaseService.savePet(pet);
    }
	
}
