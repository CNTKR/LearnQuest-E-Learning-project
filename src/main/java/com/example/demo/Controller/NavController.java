package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.TrainerStudent;
import com.example.demo.Services.LearnQServices;

@Controller
@RequestMapping
public class NavController {
	@GetMapping("/load-index") 
	public String index() {
		return "index"; 
	}
	@GetMapping("/load-registration")
	public String registration() {
		return "registration";
	}
	@GetMapping("/load-login")
	public String login() {
		return "login";
	}
	@GetMapping("/Trainer-page")
	public String Trainer() {
		return "Trainer";
	}
	@GetMapping("/Courses-page")
	public String Courses() {
		return "Courses";
	}
	@GetMapping("/Lessons-page")
	public String Lessons() {
		return "Lessons";
	}
	@GetMapping("/ViewCourses")
	public String ViewCourses() {
		return "ViewCourses";
	}
	@GetMapping("/Student-page")
	public String Student() {
		return "Student";
	}
	@GetMapping("/MyCourses-page")
	public String Mycourses() {
		return "MyCourses";
	}
	@GetMapping("/BuyCourse-page")
	public String ButCourse() {
		return "BuyCourse";
	}
	@GetMapping("/viewlessons-page")
	public String viewlessons() {
		return "viewlessons";
	}
	@GetMapping("/lessondetails-page")
	public String lessondetails() {
		return "lessondetails";
	}
}
	

