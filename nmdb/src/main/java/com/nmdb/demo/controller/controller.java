package com.nmdb.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.nmdb.demo.model.patient;
import com.nmdb.demo.repo.ptrepo;

@Controller
public class controller {
	@Autowired
	ptrepo repo;
	
	@RequestMapping("/")
	public String home() {
	return "home.jsp";
	}
	
	
	@RequestMapping ("/addpatient")
	public String addstd(patient s) {
		repo.save(s);
		
		return "home.jsp";
	
	} 
	
	@RequestMapping ("/spatient/{firstname}")
	@ResponseBody
	public List<patient> getstd(@PathVariable("firstname") String firstname) {
		repo.findByFirstname(firstname);
		
		return repo.findByFirstname(firstname);
	
}


@RequestMapping("/getpatient")
public ModelAndView getpatient(@RequestParam(value = "medicalno")Integer id ) {
	ModelAndView mv = new ModelAndView("view.jsp");
	patient p = repo.findById(id).orElse(new patient());
	mv.addObject(p);
	return mv;
	
}
	
}