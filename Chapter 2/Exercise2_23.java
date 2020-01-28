/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-28-2020
 |
 |Cost of driving calculator
 |
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise2_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double distance = 0;
		double milesPerGallon = 0;
		double pricePerGallon = 0;
		double totalCost = 0;

		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		milesPerGallon = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();

		totalCost = (distance / milesPerGallon * pricePerGallon);

		System.out.printf("The cost of driving is $%.2f%n", totalCost);

	}//close main method

}//close class Exercise2_23