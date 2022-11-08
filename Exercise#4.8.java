/*
This program eceives an ASCII code (an integer between 0 and 127) and displays its character.

SAMPLE RUN:
Enter an ASCII code: 69
The character for ASCII code 69 is E
*/

import java.util.Scanner; // importing a scanner class

public class IntegerToCharacter
{
	public static void main(String[] args) {
	    
	   Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// prompt the user to enter an ASCII code
		System.out.print("Enter an ASCII code: ");
		int numberASCII = input.nextInt();
		
		// convert the interger to character
		char charASCII = (char)numberASCII;
		
		// display the result
		System.out.println("The character for ASCII code " +  numberASCII + " is " + charASCII);
		
	}
}
