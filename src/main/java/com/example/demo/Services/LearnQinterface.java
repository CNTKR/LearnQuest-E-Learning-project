package com.example.demo.Services;

import com.example.demo.Entity.Courses;
import com.example.demo.Entity.TrainerStudent;

public interface LearnQinterface {
	
	String Store(TrainerStudent ts);

	boolean Checkemail(String email);
	
	boolean valid(String email,String password);
	
	String getuserRole(String email);
	
	

}
