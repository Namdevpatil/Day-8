package javaStrings;

public class Example5 {

	public static void main(String[] args) {
		
		String password = "India@4$389AK";
		
		String finalString = "";
		
		for(int i = 0; i < password.length(); i++)
		{
			//if((Character.isDigit(password.charAt(i))))
			if((Character.isLetter(password.charAt(i))))
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
