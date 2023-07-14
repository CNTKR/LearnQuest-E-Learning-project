package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entity.Comments;
import com.example.demo.Entity.TrainerStudent;

public interface commentsinter {
	
	String Storec(Comments com);
	
	List<Comments> allcom();

}
