package com.tnsif.day3;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student(); //Constructor call 1
		s1.sid = 101;
		s1.sname = "Jai";
		s1.course = "JFS";
		
		Student s2 = new Student(); //Constructor call 2
		s2.sid = 102;
		s2.sname = "Ganesh";
		s2.course = "JFS";
				
		Student s3 = new Student(); //Constructor call 3
		s3.sid = 101;
		s3.sname = "Chethan ";
		s3.course = "Angular JS";
		
		s1.display();//Display function call
		s2.display();//Display function call
		s3.display();//Display function call
		
				
				

	}

}
