/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-31-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise3_19
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//create needed variables
		double perimeter = 0;
		double sideA = 0;
		double sideB = 0;
		double sideC = 0;
		
		//Prompting for input of each side of the triangle
		System.out.print("Enter Side A: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for Side A: ");
		}
		sideA = input.nextDouble();

		System.out.print("Enter Side B: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for Side B: ");
		}
		sideB = input.nextDouble();
		
		System.out.print("Enter Side C: ");
		while(!input.hasNextDouble())
		{
			input.next();
			System.out.print("Please enter a number for Side C: ");
		}
		sideC = input.nextDouble();
		
		//if else chain that checks if input is valid and calculates perimeter if it is
		if((sideA + sideB) <= sideC)
		{
			System.out.println("Input is invalid, cannot find perimeter.");
			System.exit(0);
		}
		else 
			if((sideA + sideC) <= sideB)
			{
				System.out.println("Input is invalid, cannot find perimeter.");
				System.exit(0);
			}
			else 
				if((sideB + sideC) <= sideA)
				{
					System.out.println("Input is invalid, cannot find perimeter.");
					System.exit(0);
				}
				else
				{
					perimeter = sideA + sideB + sideC;
					System.out.print("The perimeter is " + perimeter);
				}

	}//close main method

}//close class Exercise3_19