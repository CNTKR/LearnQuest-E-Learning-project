package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Entity.TrainerStudent;
import com.example.demo.Services.LearnQServices;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class SerController {
	
	@Autowired
	LearnQServices lqs;
	
    @PostMapping("/store-data")
	public String Storedata(@RequestParam("first-name")String fname,@RequestParam("last-name")String lname,@RequestParam("dob")String dob,@RequestParam("gender")String gender,@RequestParam("profession")String profession,@RequestParam("phone")long phone,@RequestParam("email")String email,@RequestParam("password")String password,@RequestParam("confirm-password")String confirmpassword) {
		boolean emailExist=lqs.Checkemail(email);
		if(emailExist==false) {
		TrainerStudent ts = new TrainerStudent(fname,lname,dob,gender,profession,phone,email,password,confirmpassword);
		lqs.Store(ts);
		System.out.println("Successfully registered");
		return "login";
		}else {
			System.out.println("Already exist");
			return "registration";
		}
    }
     @PostMapping("/valid-data")
	 public String validatedata(@RequestParam("email")String email,@RequestParam("password")String password) {
			boolean v = lqs.valid(email, password);
			if(v==true) {
				if(lqs.getuserRole(email).equals("student")) {
					return "Student";
				}
				else {
				return "Trainer";
			}
			}
			else {
				System.out.println("incorrect credentials , try again");
				return "login";
			}
		}
		    }
		  