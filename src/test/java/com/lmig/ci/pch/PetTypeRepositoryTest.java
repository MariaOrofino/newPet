/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
 */

package com.lmig.ci.pch;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmig.ci.pch.domain.PetType;
import com.lmig.ci.pch.repository.PetTypeRepository;

/**
 * @author n0129947
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unit-test")
@Rollback(true)
public class PetTypeRepositoryTest {

    @Autowired
    private PetTypeRepository petTypeRepository;

    @Test
    public void petTypeTest() {
        PetType petType = new PetType();
        petType.setPetSpecies("species");
        petType.setDropDownInd(false);

        // check that we do not have an id set yet
        Assert.assertTrue(petType.getPetTypeId() == null);

        petTypeRepository.save(petType);

        // check that what was saved got an id
        Assert.assertTrue(petType.getPetTypeId() != null);
        
        Assert.assertTrue(petType.getDropDownInd() == false);
        
        Assert.assertFalse(petType.getPetSpecies() == "Cat");

    }

}
