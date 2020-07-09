package com.prototype;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID...");
		int studentId = sc.nextInt();
		System.out.println("Enter name...");
		String studentName = sc.next();
		System.out.println("Enter age...");
		int studentAge = sc.nextInt();
		Student student = new Student(studentId, studentName, studentAge);
		student.showData();
		Student student1 = student.getClone();
		student1.showData();
		sc.close();

	}

}
