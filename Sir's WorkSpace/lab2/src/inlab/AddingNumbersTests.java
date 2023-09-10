package inlab;
import org.junit.Assert;
import org.junit.Test;

import inlab.inlab1;

public class AddingNumbersTests {

	private inlab1 myCalculator = new inlab1();

	@Test
	public void addTwoPositiveNumbers()
	{
		int expectedResult = 30;
		int ActuaResult = myCalculator.Add(10, 20);
		Assert.assertEquals("The the sum of two positive numbers is correct" , expectedResult, ActuaResult);	
	}

	@Test
	public void addTwoNegativeNumbers()
	{
		int expectedResult = -30;
		int ActuaResult = myCalculator.Add(-10, -20);
		Assert.assertEquals("The the sum of two negative numbers is correct" , expectedResult, ActuaResult);	
	}	
}
