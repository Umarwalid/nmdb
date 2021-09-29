package com.nmdb.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nmdb.demo.model.patient;






@RepositoryRestResource(collectionResourceRel ="patient",path = "patient") 
public interface ptrepo extends JpaRepository<patient,Integer> {
	
	
	
}