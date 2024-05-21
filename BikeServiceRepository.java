package com.example.finalprojectdemo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalprojectdemo2.model.BikeService;
@Repository
public interface BikeServiceRepository extends JpaRepository<BikeService,Integer>{

}
