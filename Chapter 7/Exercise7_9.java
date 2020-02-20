/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-19-2020				
 *-------------------------------------*/

import java.util.Scanner;

class Exercise7_9
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double[] array1 = new double[10];
		
		System.out.print("Please enter 10 numbers seperated by a space: ");
		for(int i = 0; i < array1.length; i++)
			array1[i] = input.nextDouble();
			
		System.out.println("The minimum number in that set is " + min(array1));
	}//end main method
	
	public static double min(double[] array)
	{
		double min = array[0];
		for(int j = 0; j < array.length; j++)
		{
			if(min > array[j])
				min = array[j];
		}
		return min;
	}//end min method
	
}//end Exercise7_9