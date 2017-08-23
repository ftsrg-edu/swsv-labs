package hu.bme.mit.swsv.cache.tests;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.emory.mathcs.backport.java.util.Arrays;
import hu.bme.mit.swsv.cache.AbstractCache;

@RunWith(Parameterized.class)
public class AbstractCacheParameterizedTest {
	
	private class TestingCache extends AbstractCache<String,Integer> {}
	
	private String[] keys;
	private Integer[] values;
	private String keyToGet;
	private Integer expectedNumber;
	
	public AbstractCacheParameterizedTest(String[] keys, Integer[] values, String keyToGet, Integer expectedNumber) {
		this.keys = keys;
		this.values = values;
		this.keyToGet = keyToGet;
		this.expectedNumber = expectedNumber;
	}
	
	@Parameters
	public static List paramValues() {
		return Arrays.asList(new Object[][] {
			  {new String[] { "apple", "pear"}, new Integer[] { 5, 6},  "apple", 5 },
			  // TODO: Add more test cases
		});
	}
	
	@Test
	public void getTest() {
		// Arrange
		TestingCache c = new TestingCache();
		for(int i = 0; i < keys.length; i++) {
			c.put(keys[i], values[i], false);
		}
		
		// Act
		Integer result = c.get(keyToGet);
		
		// Assert
		assertEquals(expectedNumber,result);
	}
}
