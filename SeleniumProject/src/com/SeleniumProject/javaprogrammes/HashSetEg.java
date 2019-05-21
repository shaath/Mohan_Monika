package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) 
	{
		HashSet<String> s=new HashSet<String>();
		
		s.add("Nidish");
		s.add("Apple");
		s.add("Selenium");
		s.add("UFT");
		s.add("Manual");
		s.add("Apple");
		
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String x=it.next();
			System.out.println(x);
		}

	}
}
