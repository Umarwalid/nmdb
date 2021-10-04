package com.nmdb.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nmdb.demo.model.records;





@RepositoryRestResource(collectionResourceRel ="records",path = "records") 
public interface recrepo extends JpaRepository<records,Integer> {
	
	List<records> findByHospital(String Hospital);
	List<records> findByMedicalno(int Medicalno );
	
}