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
import com.nmdb.demo.model.records;
import com.nmdb.demo.repo.ptrepo;
import com.nmdb.demo.repo.recrepo;

@Controller
public class controller {
	@Autowired
	ptrepo repo;
	@Autowired
	recrepo rpo;
	
	@RequestMapping("/")
	public String home() {
	return "home.jsp";
	}
	@RequestMapping("/go")
	public String go() {
	return "addpt.jsp";
	}
	@RequestMapping ("/addpatient")
	public String addpt(patient s) {
		repo.save(s);
		
		return "home.jsp";
	
	} 
	
	
	
	@RequestMapping ("/patient/{firstname}")
	@ResponseBody
	public List<patient> getpt(@PathVariable("firstname") String firstname) {
		repo.findByFirstname(firstname);
		
		return repo.findByFirstname(firstname);
	
}


@RequestMapping("/getpatient")
public ModelAndView getpatient(@RequestParam(value = "medicalno")Integer medicalno ) {
	ModelAndView mv = new ModelAndView("view.jsp");
	patient patient = repo.findById(medicalno).orElse(new patient());
	mv.addObject(patient);
	return mv;
	
}

@RequestMapping ("/addrec")
public String addrec(records r) {
	rpo.save(r);
	
	return "view.jsp";

} 

@RequestMapping("/getrec")
public ModelAndView getrec(@RequestParam(value = "medicalno")Integer medicalno ) {
	ModelAndView mv = new ModelAndView("showrecords.jsp");
	records r = rpo.findById(medicalno).orElse(new records());
	mv.addObject(r);
	return mv;
	
}

}