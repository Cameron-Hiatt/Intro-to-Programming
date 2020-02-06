/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-6-2020				
 *-------------------------------------*/
class Exercise5_11 
{
	public static void main(String[] args) 
	{
		//a variable to keep track of when a new line needs to be made in the loop
		int counter = 0;
		
		System.out.println("Counting from 100 - 200 and showing numbers");
		System.out.println("divisible by 5 or 6, but not 5 and 6");
		System.out.println("-------------------------------------------");
		
		for(int i = 100; i <= 200; i++)
		{
			//checking for numbers divisible by 5 only
			if(i % 5 == 0 && i % 6 != 0)
			{
				if(counter == 10)
				{
					System.out.println();
					counter = 0;
				}
				System.out.print(i + " ");
				counter++;
			//checking for numbers divisible by 6 only
			}else if(i % 6 == 0 && i % 5 != 0)
			{
				if(counter == 10)
				{
					System.out.println();
					counter = 0;
				}
				System.out.print(i + " ");
				counter++;
			}//end else if
			
		}//end for loop
		
	}//end main method
	
}//end Exercise5_11