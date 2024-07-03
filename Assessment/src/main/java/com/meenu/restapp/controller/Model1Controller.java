package com.meenu.restapp.controller;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meenu.restapp.model.Model1;
import com.meenu.restapp.serviceimpl.Model1ServiceImpl;

@RestController
@RequestMapping("/Owner")
@CrossOrigin("*")
public class Model1Controller {
	
	
	Model1ServiceImpl mservice;
	
	public Model1Controller(Model1ServiceImpl mservice) {
		super();
		this.mservice = mservice;
	}
	
	static final String SUCCESS = "Success";
	static final String FAILURE = "failure";
	@PostMapping
	public String insertData(@RequestBody Model1 mod) {
		String msg="";
		try {
			mservice.addData(mod);
			msg=SUCCESS;
			
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
		
	}
	@GetMapping("{id}")
	public Model1 getDataById(@PathVariable("id") int id) {
		return mservice.getData(id);
	}
	@GetMapping("/all")
	public List<Model1> getDatas(){
		return mservice.getAllDatas();
	}
	
	@PutMapping
	public String updateData(@RequestBody Model1 mod) {
		String msg="";
		
		try {
			mservice.updateData(mod);
			msg=SUCCESS;
			
			
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
		
		
	}
	@DeleteMapping("{id}")
	public String deleteData(@PathVariable("id") int id) {
		String msg="";
		try {
			mservice.deleteData(id);
			msg=SUCCESS;
		}
		catch(Exception e) {
			
			msg=FAILURE;
		}
		return msg;
	}

}
