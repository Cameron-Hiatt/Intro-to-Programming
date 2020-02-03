/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-31-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise3_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//creating all needed variables 
		double x = 0;
		double y = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		
		//Prompting user for input for each variable and not allowing things forward if they type anything but a number
		System.out.print("Enter a: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for a: ");
		}
			a = input.nextDouble();
			
		System.out.print("Enter b: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for b: ");
		}
			b = input.nextDouble();
			
		System.out.print("Enter c: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for c: ");
		}
			c = input.nextDouble();
	
		System.out.print("Enter d: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for d: ");
		}
			d = input.nextDouble();

		System.out.print("Enter e: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for e: ");
		}
			e = input.nextDouble();
		
		System.out.print("Enter f: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for f: ");
		}
			f = input.nextDouble();
			
		//If-else statement that checks whether or not there is a possible solution
		//If the denominator is 0, the program terminates, otherwise it finds and displays the solution.	
		if((a * d - b * c) == 0)
		{
			System.out.println("Cannot divide by zero");
			System.exit(0);		
		} else {
			//Cramer's rule written out 
			x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
			y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}

	}//close main method

}//close class Exercise3_3