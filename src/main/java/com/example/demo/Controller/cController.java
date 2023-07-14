package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Services.Courseservice;
import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;
@Controller
@RequestMapping
public class cController {
	@Autowired
	Courseservice cs;
	@PostMapping("/course-data")
	public String Coursedata(@RequestParam("courseID")int courseID,@RequestParam("courseName")String courseName,@RequestParam("coursePrice")int coursePrice,@RequestParam("courseMentor")String courseMentor,@RequestParam("lastUpdated")String lastUpdated,@RequestParam("language")String language,@RequestParam("lessons")String lessons) {
		Courses course=new Courses();
		course.setCourseID(courseID);
		course.setCourseName(courseName);
		course.setCourseMentor(courseMentor);
		course.setCoursePrice(coursePrice);
		course.setLanguage(language);
		course.setLastupdated(lastUpdated);
		cs.coursedata(course);
		return "Courses";
}
	@PostMapping("/lesson-data")
	public String Lessonsdata(@RequestParam("courseID")int courseID,@RequestParam("lessonID")int lessonID,@RequestParam("lessonName")String lessonName,@RequestParam("topic")String topic,@RequestParam("link")String link) {
	Courses course=cs.getcourse(courseID);
	Lessons leson=new Lessons(lessonID,lessonName,topic,link,course);
	cs.lessondata(leson);
	course.getLessons().add(leson);
	return "Lessons";
	} 
	@GetMapping("/ViewCourse-data")
	public String Viewcorse(Model model) {
		List<Courses> list=cs.courseList();
		model.addAttribute("list",list);
		return "ViewCourses";	
	}
	}

