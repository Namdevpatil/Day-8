package javaInnerClasses;

import javaInnerClasses.Customer.Address;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(122, "Rahul");
		System.out.println(customer.toString());
		
		System.out.println("===============================================================");
		
		Customer.Address address = new Customer.Address("xyz");
		System.out.println(address.getCustomerDetails());

	}

}
