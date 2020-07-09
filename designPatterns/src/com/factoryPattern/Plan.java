package com.factoryPattern;

public abstract class Plan {
	protected int rate;
	
	abstract void getRate();
	
	public int calculateBill(int days)
	{
	//	System.out.println(days + rate);
		return days*rate;
	}

}
