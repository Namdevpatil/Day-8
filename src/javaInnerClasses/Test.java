package javaInnerClasses;

import javaInnerClasses.Customer.Address;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer(122, "Rahul");
		System.out.println(customer.toString());
		
		System.out.println("===============================================================");
		
		//Address address = customer.new Address("xyz");
		//System.out.println(address.getCustomerDetails());

	}

}
