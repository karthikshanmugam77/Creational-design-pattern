package com.factoryPattern;

public class ObjectBuilder {
	public Plan returnObject(String service)
	{
		if(service.equalsIgnoreCase("jio"))
		{
			return new Jio();
		}
		else if(service.equalsIgnoreCase("airtel"))
		{
			return new Airtel();
		}
		else if(service.equalsIgnoreCase("vodafone"))
		{
			return new Vodafone();
		}
		return null;
		
	}

}
