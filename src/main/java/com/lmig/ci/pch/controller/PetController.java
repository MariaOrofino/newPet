/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.ci.pch.domain.Location;
import com.lmig.ci.pch.domain.Pet;
import com.lmig.ci.pch.domain.PetStatus;
import com.lmig.ci.pch.domain.PetType;
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

    // TODO decide if you need a controller for each domain object
    // TODO have your methods here call your service which calls your dao
    @ApiOperation(value = "Save Pet", response = Pet.class)
    @PostMapping(value = "/savePet", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pet createPet(@RequestBody Pet pet) {
        return databaseService.savePet(pet);
    }
    
    @ApiOperation(value = "Find All Pets")
    @GetMapping(value="/find-all-pets")
    public List<Pet> findAllPets(){
        return databaseService.findAllPets();
    }
    
    @ApiOperation(value = "Save Location", response = Location.class)
    @PostMapping(value = "/saveLocation", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Location saveLocation(@RequestBody Location location) {
        return databaseService.saveLocation(location);
    }
    
    @ApiOperation(value = "Pet Type", response = PetType.class)
    @PostMapping(value = "/selectPetSpecies", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PetType getPetSpecies(@RequestBody PetType petType) {
        return databaseService.selectPetType(petType);
    }
    
    @ApiOperation(value = "Pet Status", response = PetStatus.class)
    @PostMapping(value = "/selectPetStatus", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PetStatus getPetSpecies(@RequestBody PetStatus petStatus) {
        return databaseService.selectPetStatus(petStatus);
    }

//  TODO
   
//    TODO from bill for push
    

    
//    @ApiOperation(value = "Find Pets by location")
//    @GetMapping(value="/find-pets-by-location")
//    public List<Pet> findPetsByLocation(){
//        return databaseService.findPetsByLocation();
    
}
    
