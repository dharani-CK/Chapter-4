/*
This program prompts the user to enter the number of sides and their length of a regular polygon and displays its area. 

SAMPLE RUN:
Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 72.69017017488385
*/

import java.util.Scanner; // importing scanner class

public class AreaOfPolygon {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter the number of sides
	    System.out.print("Enter the number of sides: ");
	    double numSides = input.nextDouble();
	    
	    // prompt the user to enter the side
		  System.out.print("Enter the side: ");
		  double side = input.nextDouble();
		
		  // compute the area
		  double area = (numSides * side * side) / (4 * Math.tan(Math.PI / numSides)); 
		
		  // display the area
		  System.out.println("The area of the hexagon is " + area);
    
	}
}
