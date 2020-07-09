package com.prototype;

public class Student {

	private int studentId;
	private String studentName;
	private int studentAge;

	public Student(int studentId, String studentName, int studentAge) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public void showData() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Age: " + studentAge);
	}
	
	public Student getClone() {
		return new Student(studentId, studentName, studentAge);
	}

}
