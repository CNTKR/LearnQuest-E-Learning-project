package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lessons {
	@Id
	int LessonID;
	String LessonName;
	String Topic;
	String link;
	@ManyToOne
	Courses course;
	public Lessons() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lessons( int lessonID, String lessonName, String topic, String link, Courses course) {
		super();
		
		LessonID = lessonID;
		LessonName = lessonName;
		Topic = topic;
		this.link = link;
		this.course = course;
	}
	public int getLessonID() {
		return LessonID;
	}
	public void setLessonID(int lessonID) {
		LessonID = lessonID;
	}
	public String getLessonName() {
		return LessonName;
	}
	public void setLessonName(String lessonName) {
		LessonName = lessonName;
	}
	public String getTopic() {
		return Topic;
	}
	public void setTopic(String topic) {
		Topic = topic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lessons [LessonID=" + LessonID + ", LessonName=" + LessonName + ", Topic=" + Topic + ", link=" + link
				+ ", course=" + course + "]";
	}
	
	
}
