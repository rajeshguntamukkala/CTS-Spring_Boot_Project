package com.example.finalprojectdemo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalprojectdemo2.exception.ResourceNotFoundException;
import com.example.finalprojectdemo2.model.BikeService;
import com.example.finalprojectdemo2.repository.BikeServiceRepository;


@Service

public class BikeServiceImpl implements BikeServiceService {
	
	@Autowired
	BikeServiceRepository BSR;
	
	@Override
	public BikeService saveBikeService(BikeService BikeService) {
		return BSR.save(BikeService);
	}
	
	
	@Override
	public BikeService getBikeService(int id) {
      BSR.findById(id).orElseThrow(()-> new ResourceNotFoundException ());
 		return BSR.findById(id).get();
 
	}
	@Override
	public BikeService updateBikeService(int id, BikeService BikeService) {
 		BikeService Bike = BSR.findById(id).orElseThrow(()-> new ResourceNotFoundException ());
		
		Bike.setId(BikeService.getId());
		 
		Bike.setBikemake(BikeService.getBikemake());
 
 
		Bike.setRegistrationNumber(BikeService.getRegistrationNumber());
 
		Bike.setBikechassisNumber(BikeService.getBikechassisNumber());
 
		Bike.setKnownissues(BikeService.getKnownissues());
 
		Bike.setCost(BikeService.getCost());
 
		Bike.setGivendate(BikeService.getGivendate());
 
		Bike.setExpecteddeliverydate(BikeService.getExpecteddeliverydate());
 

		return BSR.save(Bike);
 
	}
	@Override
	 
	public boolean deleteBikeServiceById(int id) {
 		BSR.findById(id).orElseThrow(()-> new ResourceNotFoundException ());
        BSR.deleteById(id);
		System.out.println("the delete is:"+id);
 		return true;
	}
	
	
	@Override
	 
	public List<BikeService> showAll() {
 		return BSR.findAll();
 
	}
}
