package com.nmdb.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nmdb.demo.model.patient;






@RepositoryRestResource(collectionResourceRel ="std",path = "std") 
public interface ptrepo extends JpaRepository<patient,Integer> {
	
	List<patient> findByFirstname(String Firstname);
	List<patient> findByLastname(String Lastname);
	List<patient> findByOthername(String Othername);
	List<patient> findByGender(String Gender);
	List<patient> findByNationality(String Nationality);
    //List<patient> findById( int Id);
    //List<patient> findByMedicalno(int medicalno);
	
	
}