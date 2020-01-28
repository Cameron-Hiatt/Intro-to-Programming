/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-28-2020
 |
 |
 |
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise2_13
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final double interestRate = 0.00417;
		double monthlySavings = 0;
		double sixthMonth = 0;

		System.out.print("Enter monthly savings amount: ");
		monthlySavings = input.nextDouble();
		
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);
		sixthMonth = (monthlySavings + sixthMonth) * (1 + interestRate);

		System.out.println("After the sixth month, the account value is $" + sixthMonth);
		System.out.println("");

	}//close main method

}//close class Exercise2_13