package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;


public interface Sinterface {
	
	public  Lessons getlessonid(int lessonID);
	
	public List<Courses> callList();
}
