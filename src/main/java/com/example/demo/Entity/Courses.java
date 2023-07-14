package com.example.demo.Entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Courses {
	@Id
	int courseID;
	String courseName;
	int coursePrice;
	String courseMentor;
	String Lastupdated;
	String Language;
	@OneToMany
	List<Lessons> lessons;
	public Courses() {
		super();
		
	}
	public Courses(int courseID, String courseName, int coursePrice, String courseMentor, String lastupdated,
			String language, List<Lessons> lessons) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
		this.courseMentor = courseMentor;
		Lastupdated = lastupdated;
		Language = language;
		this.lessons = lessons;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	public String getCourseMentor() {
		return courseMentor;
	}
	public void setCourseMentor(String courseMentor) {
		this.courseMentor = courseMentor;
	}
	public String getLastupdated() {
		return Lastupdated;
	}
	public void setLastupdated(String lastupdated) {
		Lastupdated = lastupdated;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public List<Lessons> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lessons> lessons) {
		this.lessons = lessons;
	}
	@Override
	public String toString() {
		return "Courses [courseID=" + courseID + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", courseMentor=" + courseMentor + ", Lastupdated=" + Lastupdated + ", Language=" + Language
				+ ", lessons=" + lessons + "]";
	}
	
	
}

