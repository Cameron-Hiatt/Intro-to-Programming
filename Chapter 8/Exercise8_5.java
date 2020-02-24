/*-------------------------------------*
 |Author:	Cameron Hiatt			
 |Date:		2-19-2020				
 *-------------------------------------*/

class Exercise8_5
{
	public static void main(String[] args) 
	{
		double[][] matrixA = new double[3][3];
		double[][] matrixB = new double[3][3];
		double[][] matrixC = new double[3][3];
		
		for(int i = 0; i < matrixA.length; i++)
			for(int j = 0; j < matrixA[i].length; j++)
				matrixA[i][j] = 1;
				
		for(int i = 0; i < matrixA.length; i++)
			for(int j = 0; j < matrixA[i].length; j++)
				matrixB[i][j] = 1;
				
		matrixC = addMatrix(matrixA, matrixB);
				
		for(int i = 0; i < matrixA.length; i++)
		{
			for(int j = 0; j < matrixA[i].length; j++)
				System.out.print(matrixC[i][j] + "\t");
			System.out.println();
		}
		
	}//end of main method
	
	
	public static double[][] addMatrix(double[][] a, double[][] b)
	{	
		double[][] c = new double[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a[i].length; j++)
				c[i][j] = a[i][j] + b[i][j];
				
		return c;

	}//end of addMatrix method
			
}//end Exercise8_5