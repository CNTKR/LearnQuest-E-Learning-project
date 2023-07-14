package com.example.demo.Services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;
import com.example.demo.Entity.TrainerStudent;
import com.example.demo.Repository.CourseInterface;
import com.example.demo.Repository.Srepo;

@Service
public class Courseservice implements Cinterface{
	
	@Autowired
	CourseInterface cfrepo;
	@Autowired
	Srepo sr;

	@Override
	public String coursedata(Courses cs) {
		cfrepo.save(cs);
		return "Course data added successful";
	}
	@Override
	public String lessondata(Lessons ls) {
		sr.save(ls);
		return "lesson added successfull";
	}
	@Override
	public  Courses getcourse(int courseID) {
		return cfrepo.findById(courseID).get();
	}
	@Override
	public List<Courses> courseList() {
		return cfrepo.findAll();
	
	}
	
	

}
