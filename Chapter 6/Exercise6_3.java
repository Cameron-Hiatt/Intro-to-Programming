/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-10-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise6_3
{
	public static void main(String[] args) 
	{
		//create needed variables
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		//prompt user input
		System.out.print("Enter integer: ");
		n = input.nextInt();
		
		//call reverse method
		System.out.println("The reverse of " + n + " is " + reverse(n));
		
		//call to isPalindrome method
		if(isPalindrome(n) == true)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");
	
	}//end of main method
	
	public static int reverse(int number)
	{
		int newNumber = 0;
		while(number != 0)
		{
			newNumber = newNumber * 10 + (number % 10);
			number = number / 10;
		}
	
		return newNumber;
	}//end of reverse method
	
	public static boolean isPalindrome(int number)
	{
		if(number == reverse(number))
			return true;
		else 
			return false;
	}//end of isPalindrome method
	
}//end of class Exercise6_3