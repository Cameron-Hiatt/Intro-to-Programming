/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		1-17-2020				
 *-------------------------------------*/

public class Exercise1_13
{
	public static void main(String[] args)
	{
		//Initializing variables to their associated values, aside from x and y
		double x = 0;
		double y = 0;
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;

		//Cramer's rule written out 
		x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		y = (((a * f) - (e * c)) / ((a * d) - (b * c)));


		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}//close main method

}//close class Exercise1_13