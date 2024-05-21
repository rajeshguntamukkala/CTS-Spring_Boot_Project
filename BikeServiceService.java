package com.example.finalprojectdemo2.service;

import java.util.List;

import com.example.finalprojectdemo2.exception.ResourceNotFoundException;
import com.example.finalprojectdemo2.model.BikeService;

public interface BikeServiceService {
	public BikeService saveBikeService(BikeService BikeService) throws ResourceNotFoundException;
	public BikeService getBikeService(int id) throws ResourceNotFoundException;
	public BikeService updateBikeService(int id,BikeService BikeService) throws ResourceNotFoundException;
	public boolean deleteBikeServiceById(int id) throws ResourceNotFoundException;
	public List<BikeService> showAll();
}
