/*-------------------------------------* 
|Author:   	Cameron Hiatt 
|Date:		February 27th, 2020
*-------------------------------------*/

package erpQuoteTool;
import java.util.Scanner;

/**
 * <h1>JavaDoc Test</h1>
 * <p>The ERPQuoteTool class is a mock up quote generator for the Epik company.
 * The prices here are not actual prices and this is meant to be a type of what could be used as a tool to help
 * generate quotes for potential customers on products and services they need. </p>
 * 
 * <p>Created: February 25th, 2020</p>
 * @author Cameron Hiatt
 *
 */
public class ERPQuoteTool 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int customerType = 0;
		
		System.out.print("Welcome to the Epik Quote Tool!\nThis tool is provided to get you the most accurate quote possible on our");
		System.out.println(" products and services. Continue through the following prompts to get your custom quote!\n");
		
		System.out.println("Please select one of the following that applies to your company (Key in the number beside your option and press enter)");
		System.out.println("1. Premium Business Customer");
		System.out.println("2. Independent Business Customer");
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
			premiumCustomer();
		else
			independentCustomer();
		
	}//end of main method
	
	/**
	 * The premiumCustomer method prompts the user for information based on their answer given in the main method. 
	 * The main difference in this method from future methods is that it calls a specific calculation method for a premium quote 
	 * rather than an independent business quote.
	 * 
	 * <pre>Example: premiumCustomer();</pre>
	 */
	public static void premiumCustomer()
	{
		Scanner input = new Scanner(System.in);
		
		int[] quote = new int[3];
		String[] productName =  {"4Port", "4Port PRI", "8Port","8Port PRI"};
		int[] productPrice = {1000, 1500, 1600, 2100};//8Port, 8Port PRI cost respectively
		
		String[] serviceName = {"Telephone Line", "Fax Line", "Fire Alarm", "Security Alarm", "Elevator Alarm", "Internet Failover", "Emergency Call Box", "PRI Telephone Line"};

		int[] userSelection = new int[8];
		int userContract = 0;
		boolean validity = false;
		int unitType = 0;
		
		System.out.println("Please select the services to be used up to 8 total");
		System.out.println("__________________________________________________________________"
				+ "_______________________________________________________________________");
		System.out.println("Input the number next to the desired service followed by a space, "
				+ "then press enter when all desired services (up to 8 total) are selected");
		System.out.println("Example: 1 2 3 8 0 0 0 0");
		System.out.println("__________________________________________________________________"
				+ "_______________________________________________________________________");
		System.out.println("0. No Service\n"
						 + "1. Telephone Line\n"
						 + "2. Fax Line\n"
						 + "3. Fire Alarm\n"
						 + "4. Security Alarm\n"
						 + "5. Elevator Alarm\n"
						 + "6. Internet Failover\n"
						 + "7. Emergency Call Box\n"
						 + "8. PRI Telephone Line\n");
		
		//A do while loop that will repeat until valid integer input is given from the user
		do
		{
			validity = true;
			System.out.print("Your input: ");
			for(int i = 0; i < userSelection.length; i++)
				userSelection[i] = input.nextInt();
			
			//for loop that checks validity of user's input
			for(int j = 0; j < userSelection.length; j++)
				if(userSelection[j] < 0 || userSelection[j] > 8)
					validity = false;
			
			//Displays error message if invalid input was found
			if(validity == false)
				System.out.println("One or more of your inputs was invalid, please try again.");
			
		}while(validity == false);
		
		System.out.println("Please select how long this service contract will be");
		System.out.println("_______________________________________________________________");
		System.out.println("Input one of the numbers next to the projected contract length");
		System.out.println("_______________________________________________________________");
		System.out.println("1. 12 Months\n"
					 	 + "2. 24 Months\n"
						 + "3. 36 Months\n"
						 + "4. 48 Months\n"
						 + "5. 60 Months\n"
						 + "6. Exit Program\n");
		System.out.print("Your input: ");
		
		//a do while loop that contains a nested while loop to prevent any invalid input from being accepted and exiting the program early
		do
		{
			while(!input.hasNextInt())
			{
				input.next();
				System.out.print("Invalid input\nPlease enter a number between 1-5: ");
			}
			userContract = input.nextInt();
			
			if(userContract == 6)
				System.exit(0);
			
			if(userContract > 5 || userContract < 1)
				System.out.print("Invalid input\nPlease enter a number between 1-5: ");
			
		}while(userContract > 5 || userContract < 1);
		
		quote = calculatePremiumQuote(userSelection, userContract);
		
		for(int j = 0; j < productPrice.length; j++)
			if(quote[0] == productPrice[j])
				unitType = j;
		
		System.out.println("Based on your needs of the following services:");
		for(int i = 0; i < userSelection.length; i++)
			if(userSelection[i] != 0)
				System.out.print(serviceName[userSelection[i] - 1] + ", ");
			System.out.println("\n");
			System.out.println("Your Custom quote prices come out to the following");
			System.out.println("Unit model needed:" + productName[unitType] + "\nUnit Price: $" + quote[0]);
			System.out.println("Monthly Cost: $" + quote[1]);
			System.out.println("Total Cost at end of contract: $" + quote[2]);
		
	}//End of premiumCustomer method
	
	/**
	 * The calculatePremiumQuote method does a calculation based on premium prices to decide what unit is needed to 
	 * provide the services requested, that unit's cost, the price that each service will add up to monthly, and the total cost
	 * at the end of the determined contract length that includes both unit price and the total of all payments made during the contract.
	 * It returns an array containing this information.
	 * 
	 * <pre>Example: calculatePremiumQuote({1, 3, 5, 7, 0, 0, 0, 8}, 3) returns {2100, 115, 6240}</pre>
	 *  
	 * @param services (int array, these correspond with different services offered that the user chose earlier.)
	 * @param contract (int, this is a number representing one of 5 possible contract lengths for the services required.)
	 * @return result (int array, this is an array containing unit cost, monthly payment amount, and total cost of contract.)
	 */
	public static int[] calculatePremiumQuote(int[] services, int contract)
	{
		int[] result = new int[3];
		int unitCost = 0;
		int monthlyCost = 0;
		int totalCost = 0;
		int counter = 0;
		int service = 0;
		boolean priChecker = false;
		int[][] productPrice = {	{1000, 1500},//4Port, 4Port PRI cost respectively
									{1600, 2100}};//8Port, 8Port PRI cost respectively
		int[] serviceLength = {12, 24, 36, 48, 60}; //This is in months
		int[][] servicePrice = {	{30, 30, 30, 30, 30, 30, 30, 35},//12 month rate
									{26, 26, 26, 26, 26, 26, 26, 31},//24 month rate
									{22, 22, 22, 22, 22, 22, 22, 27},//36 month rate
									{18, 18, 18, 18, 18, 18, 18, 23},//48 month rate
									{12, 12, 12, 12, 12, 12, 12, 17}};//60 month rate
		
		//for loop to see how many services are requested and determine if a PRI unit is needed
		for(int i = 0; i < services.length; i++)
		{
			if(services[i] > 0)
				counter++;
			if(services[i] == 8)
				priChecker = true;
		}
		
		//if else chain to determine individual unit cost based on how many services were chosen and if there was a PRI service requested
		if(counter > 4 && priChecker == true)
			unitCost = productPrice[1][1];
		else if(counter > 4 && priChecker == false)
			unitCost = productPrice[1][0];
		else if(counter <= 4 && priChecker == true)
			unitCost = productPrice[0][1];
		else if(counter <= 4 && priChecker == false)
			unitCost = productPrice[0][0];
		
		for(int j = 0; j < services.length; j++)
		{
			if(services[j] != 0)
			{
				service = services[j];
				monthlyCost += servicePrice[contract-1][service-1];
			}
		}
		
		totalCost = (monthlyCost * serviceLength[contract-1]) + unitCost;
		
		result[0] = unitCost;
		result[1] = monthlyCost;
		result[2] = totalCost;
		
		
		return result;
	}//end of calculatePremiumQuote method
	
	/**
	 * The independentCustomer method prompts the user for information based on their answer given in the main method. 
	 * The main difference in this method from future methods is that it calls a specific calculation method for an independent quote 
	 * rather than a premium business quote.
	 * 
	 * <pre>Example: independentCustomer();</pre>
	 */
 	public static void independentCustomer()
	{
 		Scanner input = new Scanner(System.in);
		
		int[] quote = new int[3];
		String[] productName =  {"4Port", "4Port PRI", "8Port","8Port PRI"};
		int[] productPrice = {1500, 2000, 2100, 2600};//8Port, 8Port PRI cost respectively
		
		String[] serviceName = {"Telephone Line", "Fax Line", "Fire Alarm", "Security Alarm", "Elevator Alarm", "Internet Failover", "Emergency Call Box", "PRI Telephone Line"};

		int[] userSelection = new int[8];
		int userContract = 0;
		boolean validity = false;
		int unitType = 0;
		
		System.out.println("Please select the services to be used up to 8 total");
		System.out.println("__________________________________________________________________"
				+ "_______________________________________________________________________");
		System.out.println("Input the number next to the desired service followed by a space, "
				+ "then press enter when all desired services (up to 8 total) are selected");
		System.out.println("Example: 1 2 3 8 0 0 0 0");
		System.out.println("__________________________________________________________________"
				+ "_______________________________________________________________________");
		System.out.println("0. No Service\n"
						 + "1. Telephone Line\n"
						 + "2. Fax Line\n"
						 + "3. Fire Alarm\n"
						 + "4. Security Alarm\n"
						 + "5. Elevator Alarm\n"
						 + "6. Internet Failover\n"
						 + "7. Emergency Call Box\n"
						 + "8. PRI Telephone Line\n");
		
		//A do while loop that will repeat until valid integer input is given from the user
		do
		{
			validity = true;
			System.out.print("Your input: ");
			for(int i = 0; i < userSelection.length; i++)
				userSelection[i] = input.nextInt();
			
			//for loop that checks validity of user's input
			for(int j = 0; j < userSelection.length; j++)
				if(userSelection[j] < 0 || userSelection[j] > 8)
					validity = false;
			
			//Displays error message if invalid input was found
			if(validity == false)
				System.out.println("One or more of your inputs was invalid, please try again.");
			
		}while(validity == false);
		
		System.out.println("Please select how long this service contract will be");
		System.out.println("_______________________________________________________________");
		System.out.println("Input one of the numbers next to the projected contract length");
		System.out.println("_______________________________________________________________");
		System.out.println("1. 12 Months\n"
					 	 + "2. 24 Months\n"
						 + "3. 36 Months\n"
						 + "4. 48 Months\n"
						 + "5. 60 Months\n"
						 + "6. Exit Program\n");
		System.out.print("Your input: ");
		
		//a do while loop that contains a nested while loop to prevent any invalid input from being accepted and exiting the program early
		do
		{
			while(!input.hasNextInt())
			{
				input.next();
				System.out.print("Invalid input\nPlease enter a number between 1-5: ");
			}
			userContract = input.nextInt();
			
			if(userContract == 6)
				System.exit(0);
			
			if(userContract > 5 || userContract < 1)
				System.out.print("Invalid input\nPlease enter a number between 1-5: ");
			
		}while(userContract > 5 || userContract < 1);
		
		quote = calculateIndependentQuote(userSelection, userContract);
		
		for(int j = 0; j < productPrice.length; j++)
			if(quote[0] == productPrice[j])
				unitType = j;
		
		System.out.println("Based on your needs of the following services:");
		for(int i = 0; i < userSelection.length; i++)
			if(userSelection[i] != 0)
				System.out.print(serviceName[userSelection[i] - 1] + ", ");
			System.out.println("\n");
			System.out.println("Your Custom quote prices come out to the following");
			System.out.println("Unit model needed:" + productName[unitType] + "\nUnit Price: $" + quote[0]);
			System.out.println("Monthly Cost: $" + quote[1]);
			System.out.println("Total Cost at end of contract: $" + quote[2]);
		
		
	}//end of independentCustomer method
 	
 	/**
	 * The calculateIndependentQuote method does a calculation based on independent business prices to decide what unit is needed to 
	 * provide the services requested, that unit's cost, the price that each service will add up to monthly, and the total cost
	 * at the end of the determined contract length that includes both unit price and the total of all payments made during the contract.
	 * It returns an array containing this information.
	 * 
	 * <pre>Example: calculateIndependentQuote({1, 3, 5, 7, 0, 0, 0, 8}, 3) returns {2600, 165, 8540}</pre>
	 *  
	 * @param services (int array, these correspond with different services offered that the user chose earlier.)
	 * @param contract (int, this is a number representing one of 5 possible contract lengths for the services required.)
	 * @return result (int array, this is an array containing unit cost, monthly payment amount, and total cost of contract.)
	 */
 	public static int[] calculateIndependentQuote(int[] services, int contract)
	{
		int[] result = new int[3];
		int unitCost = 0;
		int monthlyCost = 0;
		int totalCost = 0;
		int counter = 0;
		int service = 0;
		boolean priChecker = false;
		int[][] productPrice = {	{1500, 2000},//4Port, 4Port PRI cost respectively
									{2100, 2600}};//8Port, 8Port PRI cost respectively
		int[] serviceLength = {12, 24, 36, 48, 60}; //This is in months
		int[][] servicePrice = {	{40, 40, 40, 40, 40, 40, 40, 45},//12 month rate
									{36, 36, 36, 36, 36, 36, 36, 41},//24 month rate
									{32, 32, 32, 32, 32, 32, 32, 37},//36 month rate
									{28, 28, 28, 28, 28, 28, 28, 33},//48 month rate
									{22, 22, 22, 22, 22, 22, 22, 28}};//60 month rate
		
		//for loop to see how many services are requested and determine if a PRI unit is needed
		for(int i = 0; i < services.length; i++)
		{
			if(services[i] > 0)
				counter++;
			if(services[i] == 8)
				priChecker = true;
		}
		
		//if else chain to determine individual unit cost based on how many services were chosen and if there was a PRI service requested
		if(counter > 4 && priChecker == true)
			unitCost = productPrice[1][1];
		else if(counter > 4 && priChecker == false)
			unitCost = productPrice[1][0];
		else if(counter <= 4 && priChecker == true)
			unitCost = productPrice[0][1];
		else if(counter <= 4 && priChecker == false)
			unitCost = productPrice[0][0];
		
		for(int j = 0; j < services.length; j++)
		{
			if(services[j] != 0)
			{
				service = services[j];
				monthlyCost += servicePrice[contract-1][service-1];
			}
		}
		
		totalCost = (monthlyCost * serviceLength[contract-1]) + unitCost;
		
		result[0] = unitCost;
		result[1] = monthlyCost;
		result[2] = totalCost;
		
		
		return result;
	}//end of calculateIndependentQuote method
	
}//end of ERPQuoteTool class
