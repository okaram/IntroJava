package okaram.samples;
import org.junit.Test;
import org.junit.Assert;

public class TestSwitchSamples {
	@Test
	public void testDayName()
	{
		Assert.assertEquals(SwitchSamples.dayName(1), "Sunday");
		Assert.assertEquals(SwitchSamples.dayName(2), "Monday");
		Assert.assertEquals(SwitchSamples.dayName(3), "Tuesday");
		Assert.assertEquals(SwitchSamples.dayName(4), "Wednesday");
		Assert.assertEquals(SwitchSamples.dayName(5), "Thursday");
		Assert.assertEquals(SwitchSamples.dayName(6), "Friday");
		Assert.assertEquals(SwitchSamples.dayName(7), "Saturday");
	}
	
	
}
