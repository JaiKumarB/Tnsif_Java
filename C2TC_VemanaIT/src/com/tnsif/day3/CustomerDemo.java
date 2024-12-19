package com.tnsif.day3;

public class CustomerDemo {

	public static void main(String[] args) {
		CustomerHomeWork c1 = new CustomerHomeWork();
		
		c1.setCid(101);
		c1.setCname ("Jai");
		c1.setCity ("Bengalore");
		System.out.println("Customer id:"+c1.getCid()+"\nName:"+c1.getCname()+"\nCity:"+c1.getCity());
		
		CustomerHomeWork c2 = new CustomerHomeWork();
		
		c2.setCid(102);
		c2.setCname ("Ganesh");
		c2.setCity ("Malgalore");
		System.out.println("\nCustomer id:"+c2.getCid()+"\nName:"+c2.getCname()+"\nCity:"+c2.getCity());

		
		CustomerHomeWork c3 = new CustomerHomeWork();
		
		c3.setCid(101);
		c3.setCname ("Jai");
		c3.setCity ("Mysore");
		System.out.println("\nCustomer id:"+c3.getCid()+"\nName:"+c3.getCname()+"\nCity:"+c3.getCity());
	}

}
