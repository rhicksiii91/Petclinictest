package com.zt.petclinic.system;

import com.zt.petclinic.vet.VetRepository;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductionConfigurationTests {

    @Autowired
    private VetRepository vets;

    @Test
    public void testFindAll() throws Exception {
        vets.findAll();
        vets.findAll(); // served from cache
    }
}
