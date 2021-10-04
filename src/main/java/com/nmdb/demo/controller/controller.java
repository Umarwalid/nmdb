package com.nmdb.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nmdb.demo.model.hospital;
import com.nmdb.demo.model.patient;
import com.nmdb.demo.model.records;
import com.nmdb.demo.repo.hprepo;
import com.nmdb.demo.repo.ptrepo;
import com.nmdb.demo.repo.recrepo;

@Controller
public class controller {
	@Autowired
	ptrepo repo;
	@Autowired
	recrepo rpo;
	@Autowired
	hprepo rep;
	
	@RequestMapping("/")
	public String home() {
	return "home.jsp";
	}

@RequestMapping ("/addhospital")
public String addhospital(hospital h) {
	rep.save(h);
	
	return "home.jsp";

} 

@RequestMapping("/reghp")
public String reghp() {
return "addhospital.jsp";
}


@RequestMapping("/loghp")
public ModelAndView loghp(@RequestParam(value = "password")Integer password ) {
	ModelAndView mv = new ModelAndView("hospitals.jsp");
	 hospital h = rep.findById(password).orElse(null);
	mv.addObject(h);
	return mv;
	
}

@RequestMapping("/goadd")
public String goadd() {
return "addrecord.jsp";
}
@RequestMapping("/show")
public String show() {
return "show.jsp";
}


@RequestMapping("/showpt")
public ModelAndView showpt(@RequestParam(value = "medicalno")Integer medicalno ) {
	ModelAndView mv = new ModelAndView("show.jsp");
	patient patient = repo.findById(medicalno).orElse(new patient());
	mv.addObject(patient);
	return mv;
	
}

@RequestMapping ("/addpatient")
public String addpt(patient s) {
	repo.save(s);
	
	return "home.jsp";

} 
	@RequestMapping("/go")
	public String go() {
	return "addpt.jsp";
	}
	
@RequestMapping("/ptinfo")
public ModelAndView ptinfo(@RequestParam(value = "medicalno")Integer medicalno ) {
	ModelAndView mv = new ModelAndView("addrecord.jsp");
	patient patient = repo.findById(medicalno).orElse(new patient());
	mv.addObject(patient);
	return mv;
	
}

@RequestMapping ("/addrec")
public String addrec(records r) {
	rpo.save(r);
	
	return "hospitals.jsp";

} 

@RequestMapping("/getrec")
public ModelAndView getrec(@RequestParam(value = "medicalno")Integer medicalno ) {
	ModelAndView mv = new ModelAndView("showrecords.jsp");
	records r = rpo.findById(medicalno).orElse(new records());
	mv.addObject(r);
	return mv;
	
}

}