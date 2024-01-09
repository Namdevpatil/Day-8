package javaStrings;

public class Example3 {

	public static void main(String[] args) {

		//String constant pool
		
		//Literal way
		
		String value1 = "Hello";
		String value2 = "Hello";
		String value3 = "Hai";
		
		System.out.println(value1.hashCode());
		System.out.println(value2.hashCode());
		System.out.println(value3.hashCode());
		
		System.out.println("=======================================");
		//Using new keyword
		
		String value11 = new String("Hello");
		String value12 = new String("Hello");
		String value13 = new String("Bye");
		
		System.out.println(value11.hashCode());
		System.out.println(value12.hashCode());
		System.out.println(value13.hashCode());

	}

}
