package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Comments;
import com.example.demo.Entity.Courses;
import com.example.demo.Entity.Lessons;
import com.example.demo.Services.Commentsimpli;
import com.example.demo.Services.Courseservice;
import com.example.demo.Services.Sservices;

@Controller
public class SController {
	@Autowired
	Courseservice cs;
	@Autowired
	Sservices ss;
	@Autowired
	Commentsimpli cms;
	@GetMapping("/Buycourses-page")
	public String Buycourses(Model model) {
		List<Courses> list=cs.courseList();
		model.addAttribute("list",list);
		System.out.println(list);
		return "BuyCourse";
	}
	@PostMapping("/getbyid-lessons")
	public String getbylessonid(@RequestParam("lessonID") int lessonid , Model model) {
	Lessons lesson=ss.getlessonid(lessonid);
	model.addAttribute("lesson",lesson);
	System.out.println(lesson);
		return "lessondetails";
	}
	@GetMapping("/allmycourses-page")
	public String mycourses(Model model) {
		List<Courses> alllist=cs.courseList();
		model.addAttribute("alllist",alllist);
		System.out.println(alllist);
		return "MyCourses";
	}
	@PostMapping("/storecomments")
	public String Storec(@RequestParam("commits")String commits, Model model) {
		Comments com=new Comments();
		com.setCommits(commits);
		cms.Storec(com);
		List<Comments> allc=cms.allcom();
		model.addAttribute("allc",allc);
		return "comments";
}
}
