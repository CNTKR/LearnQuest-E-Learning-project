package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Comments;
import com.example.demo.Repository.comrepo;

@Service
public class Commentsimpli implements commentsinter {
	@Autowired
	comrepo cr;

	@Override
	public String Storec(Comments com) {
		cr.save(com);
		
		 return "comments saved successful";
		
		
	}

	@Override
	public List<Comments> allcom() {
		return  cr.findAll();
		
	}

	
}

