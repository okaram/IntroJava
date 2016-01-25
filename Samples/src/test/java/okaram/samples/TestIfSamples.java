package okaram.samples;

import org.junit.Test;
import org.junit.Assert;

public class TestIfSamples {
	@Test
	public void testBooleanToYesNo() 
	{
		Assert.assertEquals("Yes", IfSamples.booleanToYesNo(true));
		Assert.assertEquals("No", IfSamples.booleanToYesNo(false));
	}
	
	@Test
	public void testAbs()
	{
		Assert.assertEquals(8, IfSamples.abs(8));
		Assert.assertEquals(8, IfSamples.abs(-8));
		Assert.assertEquals(0, IfSamples.abs(0));
		Assert.assertEquals(20, IfSamples.abs(20));
		Assert.assertEquals(20, IfSamples.abs(-20));
	}
	
	@Test
	public void testSign()
	{
		Assert.assertEquals(1, IfSamples.sign(10));
		Assert.assertEquals(1, IfSamples.sign(5));
		Assert.assertEquals(0, IfSamples.sign(0));
		Assert.assertEquals(-1, IfSamples.sign(-3));
	}
	
	@Test
	public void testSignChained()
	{
		Assert.assertEquals(1, IfSamples.sign_chained(10));
		Assert.assertEquals(1, IfSamples.sign_chained(5));
		Assert.assertEquals(0, IfSamples.sign_chained(0));
		Assert.assertEquals(-1, IfSamples.sign_chained(-3));
	}
}
