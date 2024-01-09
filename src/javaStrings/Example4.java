package javaStrings;

public class Example4 {

	public static void main(String[] args) {
		
		String password = "India@4$";
		
		String finalString = "";
		
		for(int i = 0; i < password.length(); i++)
		{
			if((Character.isDigit(password.charAt(i))) && (!Character.isLetter(password.charAt(i))) && (!Character.isWhitespace(password.charAt(i))))
			{
				
				finalString = finalString + password.charAt(i);
			}
			else
			{
				
			}
		}
		
		System.out.println(finalString);

	}

}
