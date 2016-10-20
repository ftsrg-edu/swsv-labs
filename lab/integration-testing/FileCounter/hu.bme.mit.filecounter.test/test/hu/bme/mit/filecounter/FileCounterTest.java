package hu.bme.mit.filecounter;

import static org.junit.Assert.*;
import hu.bme.mit.filecounter.measurement.FileContentAnalyzer;

import java.util.Hashtable;

import org.junit.Test;

public class FileCounterTest {
	
	//
	// NOTE: Although we are using JUnit, this is not an isolated unit test!
	//
	
	@Test
	public void testSingleExtension() {
		// Arrange
		
		// Act
		Hashtable<String, Integer> ht =
              FileContentAnalyzer.getFileNumbersByExtension("testproject");
		
		// Assert
		assertEquals(Integer.valueOf(1), ht.get("xml"));				
	}

}
