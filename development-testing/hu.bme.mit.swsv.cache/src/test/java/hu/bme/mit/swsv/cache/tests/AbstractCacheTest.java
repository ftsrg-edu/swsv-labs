package hu.bme.mit.swsv.cache.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import hu.bme.mit.swsv.cache.AbstractCache;

public class AbstractCacheTest {
	
	private class TestingCache extends AbstractCache<String,Integer> {}
	
	@Test
	public void testPutNotForce() {
		TestingCache cache = new TestingCache();
		cache.put("apple", 5, false);
		assertEquals(new Integer(5),cache.get("apple"));
	}
}
