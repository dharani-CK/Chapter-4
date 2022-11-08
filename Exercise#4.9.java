/*
This program receives a character and displays its Unicode. 

SAMPLE RUN:
Enter a character: E
The Unicode for the character E is 69
*/

import java.util.Scanner; // importing a scanner class

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// prompt the user to enter a character
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		// convert the character integer
		int numberASCII = (int)character;
		
		// display the result
		System.out.println("The Unicode for the character " + character + " is " + numberASCII);
		
	}
}
