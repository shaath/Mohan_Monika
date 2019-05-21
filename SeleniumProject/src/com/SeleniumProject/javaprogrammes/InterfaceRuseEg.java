package com.SeleniumProject.javaprogrammes;

public class InterfaceRuseEg {

	public static void main(String[] args)
	{
		InterfaceImplents1 im1=new InterfaceImplents1();
		im1.Vehice();
		im1.Ship();
		im1.Flight();

		InterfaceImplementsEg2 im2=new InterfaceImplementsEg2();
		im2.Vehice();
		im2.Ship();
		im2.Flight();
	}

}
