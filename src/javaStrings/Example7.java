package javaStrings;

public class Example7 {

	public static void main(String[] args) {
		
		String password = "welcome to java programming";
		
		int size = password.length();
		
		String finalString = "";
		
		for(int i = 0; i < size; i++)
		{
			while(i < size-1 && password.charAt(i) == password.charAt(i+1))
			{
				finalString = finalString + password.charAt(i);
			}
		}
		
		System.out.println(finalString);

	}

}
