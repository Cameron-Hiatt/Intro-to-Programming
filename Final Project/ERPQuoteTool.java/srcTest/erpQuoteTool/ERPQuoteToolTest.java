package erpQuoteTool;

import static org.junit.Assert.*;

import org.junit.Test;

public class ERPQuoteToolTest 
{

	@Test
	public void testCalculatePremiumQuote() 
	{
		int[] services = {1, 3, 5, 7, 0, 0, 0, 8};
		int contract = 3;
		int[] result = {2100, 115, 6240};
		assertArrayEquals(ERPQuoteTool.calculatePremiumQuote(services, contract), result);
		
		int[] services2 = {1, 2, 3, 0, 0, 0, 0, 0};
		int contract2 = 1;
		int[] result2 = {1000, 90, 2080};
		assertArrayEquals(ERPQuoteTool.calculatePremiumQuote(services2, contract2), result2);
	}
	
	
	@Test
	public void testCalculateindependentQuote() 
	{
		int[] services = {1, 3, 5, 7, 0, 0, 0, 8};
		int contract = 3;
		int[] result = {2600, 165, 8540};
		assertArrayEquals(ERPQuoteTool.calculateIndependentQuote(services, contract), result);
		
		int[] services2 = {1, 2, 3, 0, 0, 0, 0, 0};
		int contract2 = 1;
		int[] result2 = {1500, 120, 2940};
		assertArrayEquals(ERPQuoteTool.calculateIndependentQuote(services2, contract2), result2);
	}

}//end of ERPQuoteToolTest class
