package com.tnsif.day3;

public class EntityDemo {

	public static void main(String[] args) {
		StudentEntityDemo s1 = new StudentEntityDemo(); //Constructor call 1
		s1.setSid(101);
		s1.setSname ("Jai");
		s1.setCourse ("JFS");
		System.out.println("Student id:"+s1.getSid()+"\nName:"+s1.getSname()+"\nCourse:"+s1.getCourse());
		
		StudentEntityDemo s2 = new StudentEntityDemo(); //Constructor call 2
		
		s2.setSid(102);
		s2.setSname ("Ganesh");
		s2.setCourse ("JFS");
		System.out.println("\nStudent id:"+s2.getSid()+"\nName:"+s2.getSname()+"\nCourse:"+s2.getCourse());
		
		StudentEntityDemo s3 = new StudentEntityDemo(); //Constructor call 3
		
		s3.setSid(103);
		s3.setSname ("Chethan");
		s3.setCourse ("Angular JS");
		System.out.println("\nStudent id:"+s3.getSid()+"\nName:"+s3.getSname()+"\nCourse:"+s3.getCourse());
		
		
				
				

	}

}
