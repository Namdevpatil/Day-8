package javaStrings;

public class Example2 {

	public static void main(String[] args) {

		//String constant pool
		
		//Literal way
		
		String value1 = "Hello";
		String value2 = "Hello";
		String value3 = "Hai";
		
		System.out.println(value1 == value2);
		System.out.println(value1 == value3);
		
		System.out.println("=======================================");
		//Using new keyword
		
		String value11 = new String("Hello");
		String value12 = new String("Hello");
		String value13 = new String("Bye");
		
		System.out.println(value11 == value12);
		System.out.println(value11 == value13);

	}

}
