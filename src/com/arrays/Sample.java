package com.arrays;

@FunctionalInterface
public interface Sample {
	
	public void getData();
	
	static void getData2()
	{
		System.out.println("static method");
	}
	
	default void getData3()
	{
		System.out.println("default method");
	}
	

}
