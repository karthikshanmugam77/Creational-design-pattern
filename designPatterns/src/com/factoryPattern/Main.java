package com.factoryPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your sevice name...");
		String service = sc.next();
		ObjectBuilder obj = new ObjectBuilder();
		Plan p = obj.returnObject(service);
		System.out.println("Enter no. of days...");
		int days = sc.nextInt();
		p.getRate();
		int bill = p.calculateBill(days);
		System.out.println("cost = " + bill);
		sc.close();
		
	}

}
