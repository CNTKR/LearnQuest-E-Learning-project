package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;
import com.example.demo.Repository.CourseInterface;
import com.example.demo.Repository.Srepo;

@Service
public class Sservices  implements Sinterface{
	@Autowired
	Srepo sr;
	
	@Autowired
	CourseInterface cfi;

	@Override
	public Lessons getlessonid(int lessonID) {
		
		return sr.findById(lessonID).get();
	}

	

	@Override
	public List<Courses> callList() {
	return cfi.findAll();
	}

	
	}
	
	
	
	
	
	    
	


