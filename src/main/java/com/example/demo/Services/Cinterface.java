package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;

public interface Cinterface {
	
public	String coursedata(Courses cs);

public	String lessondata(Lessons ls);

public  Courses getcourse(int courseID);

public List<Courses> courseList();





}
