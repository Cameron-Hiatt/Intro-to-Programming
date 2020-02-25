/*-------------------------------------* 
|Author:   	Cameron Hiatt 
|Date:		 
*-------------------------------------*/

package erpQuoteTool;
import java.util.Scanner;

public class ERPQuoteTool 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int customerType = 0;
		
		System.out.print("Welcome to the Epik Quote Tool!\nThis tool is provided to get you the most accurate quote possible on our");
		System.out.println(" products and services. Continue through the following prompts to get your custom quote!\n");
		
		System.out.println("Please select one of the following that applies to your company (Key in the number beside your option and press enter)");
		System.out.println("1. Verizon or Verizon Partner");
		System.out.println("2. Independant business unaffiliated with Verizon");
		System.out.println("3. Exit\n");
		System.out.print("Answer: ");
		
		//a do while loop that contains a nested while loop to prevent any invalid input from being accepted and exiting the program early
		do
		{
			while(!input.hasNextInt())
			{
				input.next();
				System.out.print("Invalid input\nPlease enter a 1, 2, or 3: ");
			}
			customerType = input.nextInt();
			
			if(customerType == 3)
				System.exit(0);
			
			if(customerType > 2 || customerType < 1)
				System.out.print("Invalid input\nPlease enter a 1, 2, or 3: ");
			
		}while(customerType > 2 || customerType < 1);
		
		//passes control to 1 of 2 methods that calculate different pricing on the quote depending on the customer
		if(customerType == 1)
			verizonCustomer();
		else
			independantCustomer();
		
	}//end of main method
	
	
	public static void verizonCustomer()
	{
		Scanner input = new Scanner(System.in);
		String[] productName = new String[10];
		double[] productPrice = new double[10];
		
	}//End of verizonCustomer method
	
	public static void independantCustomer()
	{
		Scanner input = new Scanner(System.in);
		String[] productName = new String[10];
		double[] productPrice = new double[10];
		
	}//end of independantCustomer method
	
}//end of ERPQuoteTool class
