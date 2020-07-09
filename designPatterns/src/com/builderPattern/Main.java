package com.builderPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------- MENU------");
		System.out.println("1. NonVeg briyani...");
		System.out.println("2. Veg briyani...");
		System.out.println("Enter your choice...");
		int choice  = sc.nextInt();
		OrderItems order1 = new OrderItems();
		switch( choice)
		{
			case 1 : order1.add(new NonVeg());
			break;
			
			case 2 : order1.add(new Veg());
			break;
		}
		order1.show();
		sc.close();
		
		
	}

}
