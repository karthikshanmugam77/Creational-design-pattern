package com.AbstractDesignPatterns;

public class AbstractDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new StudentImplementation();
		String StudentName = s.displayStudentName("kk");
		System.out.println(StudentName);

	}

}
