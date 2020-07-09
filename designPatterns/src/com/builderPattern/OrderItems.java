package com.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class OrderItems {
	
	List<Menu> orderItems = new ArrayList<>();
	
	public void add(Menu menu)
	{
		orderItems.add(menu);
	}
	
	public void show()
	{
		orderItems.forEach(value -> System.out.print(value.name() +" - "+ value.cost()));
	}
}
