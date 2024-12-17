package com.tnsif.day1;
//Program to demonstrate TypeCasting between primitive data types.
public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Implicit / widening Type Conversion
		
		float f = 22.16f;
		double d = f;
		System.out.println(d);
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		char ch = 'A';
		int i2 = ch;
		System.out.println(i2);
		
		//Explicit / narrowing  Type Conversion
		
		double d1 = 10.78d;
		float f1 = (float) d1;
		System.out.println(d1);
		
		long l1 = 9008401136l;
		int i3 = (int)l1;
		System.out.println(i3);
		
		float f2 = 35.87f;
		int i4 = (int)f2;
		System.out.println(i4);
		
	}

}
