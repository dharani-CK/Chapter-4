/*
This program propmts the user to enter the side of a hexagon and displays its area.

SAMPLE RUN:
Enter the side: 5.5
The area of the hexagon is 78.59

*/

import java.util.Scanner; // importing scanner class

public class AreaOfHexagon {
  
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter the side
		  System.out.print("Enter the side: ");
		  double side = input.nextDouble();
		  
		  // compute the area
		  double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6)); 
		
		  // display the area
		  System.out.println("The area of the hexagon is " + area);
    
	}
  
}
