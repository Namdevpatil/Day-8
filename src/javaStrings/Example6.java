package javaStrings;

public class Example6 {

	public static void main(String[] args) {
		
		String password = "India@4$389AK";
		
		String finalString = "";
		
		for(int i = 0; i < password.length(); i++)
		{
			//if((Character.isDigit(password.charAt(i))))
			if((Character.isLetter(password.charAt(i))))
			{				
				
			}
			else
			{
				finalString = finalString + password.charAt(i);
			}
		}
		
		System.out.println(finalString);

	}

}
