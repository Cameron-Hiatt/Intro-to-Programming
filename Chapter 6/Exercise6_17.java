/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-7-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise6_17 
{
	public static void main(String[] args) 
	{
		//create needed variables
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		//prompt user input
		System.out.print("Enter n: ");
		n = input.nextInt();
		
		//call printMatrix method
		printMatrix(n);
	
	}//end of main method
	
	public static void printMatrix(int n)
	{
		//first for loop to keep track of rows
		for(int i = 0; i < n; i++)
		{
			//second for loop to print the columns 
			for(int j = 0; j < n; j++)
				System.out.print(Math.round(Math.random()) + " ");
				
			System.out.println();
		}//end of outer for loop
		
	}//end of printMatrix method
	
}//end of class Exercise6_17