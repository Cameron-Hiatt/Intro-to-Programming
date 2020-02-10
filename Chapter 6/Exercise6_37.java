/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-10-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise6_37
{
	public static void main(String[] args) 
	{
		//create needed variables
		Scanner input = new Scanner(System.in);
		int number = 0;
		int width = 0;
		
		//prompt user input
		System.out.print("Enter integer: ");
		number = input.nextInt();
		System.out.print("Enter width: ");
		width = input.nextInt();
		
		//method call to format()
		System.out.println(format(number, width));
				
	}//end of main method
	
	public static String format(int number, int width)
	{
		String resultingString = "";
		
		String strgVersion = Integer.toString(number);
		width -= strgVersion.length();
				
		for(int i = 0; i < width; i++)
			resultingString += '0';
		
		resultingString += strgVersion;
		return resultingString;
	}
		
}//end of class Exercise6_37