package com.example.finalprojectdemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.finalprojectdemo2.model.Address;
import com.example.finalprojectdemo2.model.BikeService;
import com.example.finalprojectdemo2.service.BikeServiceService;

@SpringBootTest	
public class BikeServiceTest {
	@Autowired
	 
    private BikeServiceService bike;
 
 
    @Test
 
    public void testsaveBikeService() {
 
       LocalDate ld=LocalDate.of(2024,01,04);
 
       BikeService c = new BikeService(121,"bikemake","RN",879,
 
    			"knownissues",7500,ld, ld,
 
    			ld,ld,"phonenumber",
 
    			new Address (121,"street","landmark","city","state")) ;
 
 
       BikeService addedBikeService =bike.saveBikeService(c);
 
        assertNotNull(addedBikeService.getId());
 
        assertEquals(c.getBikemake(), addedBikeService.getBikemake());        
 
    }
    

    @Test
 
    public void testgetBikeService() {
 
       LocalDate ld=LocalDate.of(2024,01,04);
 
       BikeService c = new BikeService(121,"bikemake","RN",879,
 
    			"knownissues",7500,ld, ld,
 
    			ld,ld,"phonenumber",
 
    			new Address (121,"street","landmark","city","state")) ;
 
 
       BikeService addedBikeService =bike.saveBikeService(c);
 
       bike.getBikeService(addedBikeService.getId());
 
      
    }
 
 
    @Test
    
    public void testupdateBikeService() {
 
       LocalDate ld=LocalDate.of(2024,01,04);
       
       BikeService c = new BikeService(121,"bikemake","RN",879,
    		   
   			"knownissues",7500,ld, ld,

   			ld,ld,"phonenumber",

   			new Address (121,"street","landmark","city","state")) ;
 
 
       BikeService addedBikeService =bike.saveBikeService(c);
 
        c.setBikemake("benz");

        c.setBikechassisNumber(99);

        BikeService updatedBikeService = bike.updateBikeService(addedBikeService.getId(), c );
 
        assertNotNull(updatedBikeService.getId());
 
        assertEquals("benz",updatedBikeService.getBikemake());

        assertEquals(99,updatedBikeService.getBikechassisNumber());

    } 
 
    @Test
 
    public void testdeleteBikeService() {
 
       LocalDate ld=LocalDate.of(2024,01,04);
 
       BikeService c = new BikeService(121,"bikemake","RN",879,
 
    			"knownissues",7500,ld, ld,
 
    			ld,ld,"phonenumber",
 
    			new Address (121,"street","landmark","city","state")) ;
 
 
       BikeService addedBikeService =bike.saveBikeService(c);
 
       boolean isDeleted = bike.deleteBikeServiceById(addedBikeService.getId());
 
       assertTrue(isDeleted);
 
    }  
 
}
