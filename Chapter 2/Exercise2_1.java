/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-28-2020
 |
 |Celsius to Fahrenheit converter 
 |
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise2_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double celsius = 0;
		double fahrenheit = 0;

		System.out.print("Please enter a degree in Celsius: ");
		celsius = input.nextDouble();
		
		fahrenheit = ((9.0 / 5.0) * celsius + 32);

		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		System.out.println("");

	}//close main method

}//close class Exercise2_1