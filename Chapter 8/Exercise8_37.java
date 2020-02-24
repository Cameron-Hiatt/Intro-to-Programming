/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-19-2020				
 *-------------------------------------*/

import java.util.Scanner;

class Exercise8_37
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String guess = "default";
		int score = 0;
		String[][] statesAndCaptials = {
		{"Utah"			, "Salt Lake City"},
		{"Texas"		, "Austin"},
		{"Colorado"		, "Denver"},
		{"Arizona"		, "Phoenix"},
		{"Mississippi"	, "Jackson"},
		{"Montana"		, "Helena"},
		{"Nevada"		, "Carson City"},
		{"Ohio"			, "Columbus"},
		{"Tennessee"	, "Nashville"},
		{"Washington"	, "Olympia"}};
		
		for(int i = 0; i < statesAndCaptials.length; i++)
		{
			for(int j = 0; j < statesAndCaptials[i].length; j += 2)
			{
				System.out.println("What is the capital of " + statesAndCaptials[i][j]);
				guess = input.nextLine();
				if(guess.equalsIgnoreCase(statesAndCaptials[i][1]))
				{
					System.out.println("You are correct!\n");
					score++;
				}//end if statement
				else 
					System.out.println("That is incorrect.\n");
			}//end nested for loop	
		}//end for loop
		
		System.out.println("You got " + score + " state capitals correct.");
						
	}//end of main method
			
}//end Exercise8_37