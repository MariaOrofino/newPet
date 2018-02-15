/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 9, 2018
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

import com.lmig.ci.pch.domain.PetStatus;
import com.lmig.ci.pch.repository.PetStatusRepository;

/**
 * @author n0263892
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("unit-test")
@Rollback(true)
public class PetStatusRepositoryTest {

    @Autowired
    private PetStatusRepository petStatusRepository;

    @Test
    public void petStatusTest() {
        PetStatus petStatus = new PetStatus();
        petStatus.setPetStatus("Lost");

        Assert.assertTrue(petStatus.getPetStatusId() == null);

        petStatusRepository.save(petStatus);

        Assert.assertTrue(petStatus.getPetStatusId() != null);
        
        Assert.assertEquals(petStatus.getPetStatus(), "Lost");
        
        Assert.assertFalse(petStatus.getPetStatus() == "lost");
    }

}
