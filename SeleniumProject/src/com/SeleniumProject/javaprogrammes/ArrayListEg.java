package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<String> x=new ArrayList<String>();
		
		//Writing the data into arraylist
		
		x.add("Selenium");
		x.add("Apple");
		x.add("Mohan");
		x.add("UFT");
		x.add("Monika");
		x.add(5, "Sharat");
		
		x.set(1, "Banana");
		
		System.out.println(x.size());
		

//		System.out.println(x.get(2));
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
	}

}
