package okaram.samples;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class TestRecursionSamples {
	@Test
	public void testStringTimes(){
		assertEquals("abababab", RecursionSamples.stringTimes("ab", 4));
		assertEquals("aaa", RecursionSamples.stringTimes("a", 3));
	}
	
	@Test
	public void testStringTimesAccum(){
		assertEquals("abababab", RecursionSamples.stringTimesAccum("ab", 4,""));
		assertEquals("aaa", RecursionSamples.stringTimesAccum("a", 3,""));
	}
}
