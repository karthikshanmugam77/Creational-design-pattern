package com.singletondesignpatterns;

public class SingleTonDesignPattern {

	private static SingleTonDesignPattern singleTonObject = new SingleTonDesignPattern();
	private String name;

	private SingleTonDesignPattern() {
	}

	public static SingleTonDesignPattern getObject() {
		return singleTonObject;
	}

	public String showName(String name) {
		singleTonObject.setName(name);
		return "hello " + name;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
