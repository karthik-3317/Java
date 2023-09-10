package inlab;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPassword3 {

	@Test
	public void TestPasswordLength()
	   {
	     inlab3 pv=new inlab3();
	     Assert.assertEquals(true,pv.isValid("Abc123"));
	   }

}
