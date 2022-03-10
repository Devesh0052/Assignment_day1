package com.student.app;

public class Student {
	private int rollNo=1,standard=1;
	private String name="xyz";
	
//	public Student(String name,int rollNo,int standard) {
//		this.name=name;
//		this.rollNo=rollNo;
//		this.standard=standard;
//	}
	
	public String getDetails() {
		return this.name+" "+this.rollNo+" "+this.standard;
	}
	

}
