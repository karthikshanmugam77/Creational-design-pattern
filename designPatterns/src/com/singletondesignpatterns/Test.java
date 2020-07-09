package com.singletondesignpatterns;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name...");
		String name = sc.nextLine();

		SingleTonDesignPattern obj1 = SingleTonDesignPattern.getObject();
		String showName1 = obj1.showName(name);
		System.out.println(showName1);

		SingleTonDesignPattern obj2 = SingleTonDesignPattern.getObject();
		String showName2 = obj2.showName(name);
		System.out.println(showName2);
		sc.close();

	}

}
