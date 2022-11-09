/*
This program prompts the user to enter an integer be￾tween 0 and 15 and displays its corresponding hex number. 

SAMPLE RUN:
Enter a decimal value (0 to 15): 11
The hex value is B
*/

import java.util.Scanner; // importing a scanner class

public class DecimalToHex
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// prompt the user to enter an integer between 0 to 15
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		// convert int to hex
    // display the results
		if (decimal >= 0 && decimal <= 9){
		    System.out.println("The hex value is " + decimal);
		}
		else if (decimal >= 10 && decimal <= 15){
		    System.out.println("The hex value is " + (char)(decimal + 'A' - 10));
		}
		else{
		    System.out.println(decimal + " is an invalid input");
		}
	}
}
