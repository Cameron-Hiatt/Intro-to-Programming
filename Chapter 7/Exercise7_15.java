/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-19-2020				
 *-------------------------------------*/

import java.util.Scanner;

class Exercise7_15
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] array1 = new int[10];
		
		System.out.print("Please enter 10 integers seperated by a space: ");
		for(int i = 0; i < array1.length; i++)
			array1[i] = input.nextInt();
			
		eliminateDuplicates(array1);
			
	}//end main method
	
	public static int[] eliminateDuplicates(int[] list)
	{
		int[] newList = new int[list.length];
		int counter = 0;
		int duplicateFound = 0;
		
		for(int j = 0; j < list.length; j++)
		{
			for(int l = 0; l <= j; l++)
			{
				if(list[j] == newList[l])
				{
					duplicateFound = 1;
				}
			}//end of nested for loop
			
			if(duplicateFound == 0)
			{
				newList[j] = list[j];
				counter++;
			}
			duplicateFound = 0;
		}//end for loop
		
		System.out.println("The number of distinct numbers is " + counter);
		System.out.print("The array without duplicates: ");
		for(int k = 0; k < newList.length; k++)
		{
			if(newList[k] != 0)
				System.out.print(newList[k] + " ");
		}//end for loop
		
		return newList;
		
	}//end eliminateDuplicates method
	
}//end Exercise7_15