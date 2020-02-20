/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-19-2020				
 *-------------------------------------*/

class Exercise7_23
{
	public static void main(String[] args) 
	{
		boolean[] lockerState = new boolean[100];
		
		//all lockers start closed
		for(int i = 0; i < 100; i++)
			lockerState[i] = false;
		
		for(int locker = 1; locker < 101; locker++)
			for(int student = locker; student < 101; student += locker)
				{
					if(lockerState[student - 1] == true)
						lockerState[student - 1] = false;
					else if(lockerState[student - 1] == false)
						lockerState[student - 1] = true;
				}
				
		for(int i = 0; i < 100; i++)
			if(lockerState[i] == true)
				System.out.print((i + 1) + " ");
		
	}//end of main method
			
}//end Exercise7_23