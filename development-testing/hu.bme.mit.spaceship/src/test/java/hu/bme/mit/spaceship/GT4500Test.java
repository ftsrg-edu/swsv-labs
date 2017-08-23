package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

	private GT4500 ship;	
	
	@Before
	public void init(){	
		this.ship = new GT4500();
	}
		
	@Test
	/**
	 * Test that the first single firing fires the primary torpedo if it is not empty
	 * 
	 * TODO: not a unit test, does not test the module in isolation!
	 */
	public void fireTorpedos_SinglePrimary_Success(){
		boolean result = ship.fireTorpedos(FiringMode.SINGLE);
		
		assertEquals(true, result);
	}
	
}
