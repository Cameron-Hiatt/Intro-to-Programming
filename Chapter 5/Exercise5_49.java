/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-6-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise5_49
{
	public static void main(String[] args)
	{
		//create all needed variables for the program
		Scanner input = new Scanner(System.in);
		String userString = "nothing";
		int tally = 0;
		int tallyCon = 0;
				
		System.out.print("Please enter a string and this will count the vowels: ");
		userString = input.nextLine();
		
		String upperCaseVersion = userString.toUpperCase();
		
		for(int i = 0; i < upperCaseVersion.length(); i++)
		{
			if(upperCaseVersion.charAt(i) == 'A')
				tally++;
			else if(upperCaseVersion.charAt(i) == 'E')
				tally++;
			else if(upperCaseVersion.charAt(i) == 'I')
				tally++;
			else if(upperCaseVersion.charAt(i) == 'O')
				tally++;
			else if(upperCaseVersion.charAt(i) == 'U')
				tally++;
			else if(upperCaseVersion.charAt(i) != ' ')
				tallyCon++;	
			
		}
		
		System.out.println(userString + " has " + tally + " vowels in it and " + tallyCon + " consonants in it.");
		
	}//close main method

}//close class Exercise5_49