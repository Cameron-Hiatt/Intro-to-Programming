/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-4-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise4_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double area = 0;
		double s = 0;
		double r = 0;
		double tangent = 0;
		double sin = 0;
		
		//simplifying later computation by finding the needed tangent and sin values and assigning them to a variable
		tangent = Math.tan(Math.PI / 5)	;
		sin = Math.sin(Math.PI / 5);
		
		//prompting user input
		System.out.print("Enter the length from the center to the vertex: ");
		r = input.nextDouble();
		
		//calculations for area of a pentagon
		s = 2 * r * sin;
		area = (5 * Math.pow(s, 2)) / (4 * tangent);
		
		System.out.printf("The area of the pentagon is %.2f", area);
		
	}//close main method

}//close class Exercise4_1