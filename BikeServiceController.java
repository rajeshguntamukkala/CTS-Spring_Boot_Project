package com.example.finalprojectdemo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.finalprojectdemo2.model.BikeService;
import com.example.finalprojectdemo2.service.BikeServiceService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/BikeService")
public class BikeServiceController {
	@Autowired
	BikeServiceService bike;
	
	@GetMapping("/get/{id}")
	@ResponseStatus(HttpStatus.OK)
	public BikeService getBikeServiceById(@PathVariable int id){
		return bike.getBikeService(id);
	}
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public BikeService saveBikeService(@Valid @RequestBody BikeService Bikeservice) {
		return bike.saveBikeService(Bikeservice);	
	}
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public BikeService updateBikeService(@Valid @PathVariable int id, @RequestBody BikeService BikeService) {
		return bike.updateBikeService(id, BikeService);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean deleteBikeServiceById(@PathVariable int id) {
		return bike.deleteBikeServiceById(id);
	}
	@GetMapping("/all")
	public List<BikeService>showAll(){
		return bike.showAll();
	}

}
