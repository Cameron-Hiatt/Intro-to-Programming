/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-4-2020				
 *-------------------------------------*/

import java.util.Scanner;

public class Exercise4_23
{
	public static void main(String[] args)
	{
		
		//create all needed variables for the program
		Scanner input = new Scanner(System.in);
		String name = "John Doe";
		double hours = 0;
		double payRate = 0;
		double federalRate = 0;
		double stateRate = 0;
		double grossPay = 0;
		double federalDeductions = 0;
		double stateDeductions = 0;
		double totalDeductions = 0;
		double netPay = 0;
		
		//prompt for user input
		System.out.print("Enter employee's name: ");
		name = input.nextLine();
		
		System.out.print("Enter number of hours worked: ");
		hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: $");
		payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding: ");
		federalRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding: ");
		stateRate = input.nextDouble();
		
		//calculations
		grossPay = hours * payRate;
		federalDeductions = grossPay * federalRate;
		stateDeductions = grossPay * stateRate;
		totalDeductions = stateDeductions + federalDeductions;
		netPay = grossPay - totalDeductions;
		
		//displaying results
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.printf("Gross Pay: $%.2f \n", grossPay);
		System.out.println("Deductions: ");
		System.out.printf("	Federal Withholding (%.1f%%): $%.2f\n", federalRate * 100, federalDeductions);
		System.out.printf("	State Withholding (%.1f%%): $%.2f\n", stateRate * 100, stateDeductions);
		System.out.printf("	Total Deduction $%.2f\n", totalDeductions);
		System.out.printf("Net Pay: $%.2f", netPay);
		
				
	}//close main method

}//close class Exercise4_23