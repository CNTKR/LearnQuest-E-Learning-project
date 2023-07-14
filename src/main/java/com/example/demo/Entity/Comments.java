package com.example.demo.Entity;


import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Comments {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String commits;

	public Comments() {
		super();
		 
	}
	public Comments(int id, String commits) {
		super();
		this.id = id;
		this.commits = commits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommits() {
		return commits;
	}
	public void setCommits(String commits) {
		this.commits = commits;
	}
	@Override
	public String toString() {
		return "Comments [id=" + id + ", commits=" + commits + "]";
	}
	

}