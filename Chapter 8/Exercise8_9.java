/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-21-2020				
 *-------------------------------------*/

import java.util.Scanner;
import javax.xml.crypto.dsig.keyinfo.*;

class Exercise8_9
{
	public static void main(String[] args) 
	{
		//Variables for the game and the gameBoard array
		Scanner input = new Scanner(System.in);
		String u = "\u203e";
		int selection1 = 0;
		int selection2 = 0;
		int placement = 0;
		int endGame = 0;
		boolean move = false;
		String[][] gameBoard = {
			{"_", "_", "_", "_", "_", "_", "_"},
			{"|", " ", "|", " ", "|", " ", "|"},
			{"-", "-", "-", "-", "-", "-", "-"},
			{"|", " ", "|", " ", "|", " ", "|"},
			{"-", "-", "-", "-", "-", "-", "-"},
			{"|", " ", "|", " ", "|", " ", "|"},
			{u, u, u, u, u, u, u}};
		
		//print a title
		System.out.println("TIC-TAC-TOE\n");
		
		//game loop 
		while(endGame != 999)
		{	
			//game loop variable 
			endGame = 0;
			
			//print gameBoard
			for(int i = 0; i < gameBoard.length; i++)
			{
				for(int j = 0; j < gameBoard[i].length; j++)
					System.out.print(gameBoard[i][j]);
				System.out.println();
			}
				
			while(move == false)
			{	
				//gets move from player 1
				System.out.println("Enter a row number (1, 2, or 3) for player X: ");
				selection1 = input.nextInt();
				System.out.println("Enter a column number (1, 2, or 3) for player X: ");
				selection2 = input.nextInt();
				
				//switch statements to get correct placement based on player 1 input 
				switch (selection1)
				{
					case 1:		selection1 = 1;
								break;
					case 2: 	selection1 = 3;
								break;
					case 3: 	selection1 = 5;
								break;
					default:	System.out.println("Invalid input");
								break;
				}//end switch selection1
					
				switch (selection2)
				{
					case 1:		selection2 = 1;
								break;
					case 2: 	selection2 = 3;
								break;
					case 3: 	selection2 = 5;
								break;
					default:	System.out.println("Invalid input");
								break;
				}//end switch selection2
				
				//prints player 1's move if the move is valid 
				//move is invalid if the space is not empty
				if(gameBoard[selection1][selection2] == " ")
				{
					gameBoard[selection1][selection2] = "X";
					move = true;
				}
				else 
					System.out.println("Invalid move");
			}//end of move while loop
				
			//print game gameBoard
			for(int i = 0; i < gameBoard.length; i++)
			{
				for(int j = 0; j < gameBoard[i].length; j++)
					System.out.print(gameBoard[i][j]);
				System.out.println();
			}
			
			//checks to see if there are open spaces and makes the game loop break if there are no spaces left
			for(int i = 0; i < gameBoard.length; i++)
				for(int j = 0; j < gameBoard[i].length; j++)
					if(gameBoard[i][j] == " ")
						endGame = 1;
			
			move = false;
			
			//an if statement that doesn't allow another move if the game board is full
			//without this, the gameBoard could have filled up with the last move but it end
			//the loop until after this second player's move is asked for. This then fixes that issue 
			//and skips the second player's move if the game board is full.
			if(endGame == 1)
			{
				while(move == false)
				{
					//gets move from player 2
					System.out.println("Enter a row number (1, 2, or 3) for player O: ");
					selection1 = input.nextInt();
					System.out.println("Enter a column number (1, 2, or 3) for player O: ");
					selection2 = input.nextInt();
					
					//switch statements to get correct placement based on player 2 input 
					switch (selection1)
					{
						case 1:		selection1 = 1;
									break;
						case 2: 	selection1 = 3;
									break;
						case 3: 	selection1 = 5;
									break;
						default:	System.out.println("Invalid input");
									break;
					}//end switch selection1
						
					switch (selection2)
					{
						case 1:		selection2 = 1;
									break;
						case 2: 	selection2 = 3;
									break;
						case 3: 	selection2 = 5;
									break;
						default:	System.out.println("Invalid input");
									break;
					}//end switch selection2
					
					//prints player 2's move if the move is valid 
					//move is invalid if the space is not empty
					if(gameBoard[selection1][selection2] == " ")
						{
							gameBoard[selection1][selection2] = "O";
							move = true;
						}
					else 
						System.out.println("Invalid move");
				}//end of move while loop
						
			}//end if statement for endgame variable
			
			//checks to see if there are open spaces and makes the game loop break if there are no spaces left
			for(int i = 0; i < gameBoard.length; i++)
				for(int j = 0; j < gameBoard[i].length; j++)
					if(gameBoard[i][j] == " ")
						endGame = 1;
			
			//breaks game loop if there were no empty spaces found in the array			
			if(endGame != 1)
				endGame = 999;
				
			move = false;
				
		}//end of while loop

		System.out.println("Game over, no scoring yet because assignment didn't ask for it :D");
			
	}//end of main method
			
}//end Exercise8_9