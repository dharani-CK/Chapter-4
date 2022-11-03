/*
This program prompts he user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon.
*/

import java.util.Scanner; // importing scanner class

public class AreaOfPentagon {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter the distance from the center
		  System.out.print("Enter the length form the center to a vertex: ");
		  double r = input.nextDouble();
		
		  // compute the length of the side
		  double side = 2 * r * Math.sin(Math.PI / 5);
		
		  // compute the area
		  double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
		
		  //display the area
		  System.out.println("The area of the pentagon is " + area);
    
	}
}
