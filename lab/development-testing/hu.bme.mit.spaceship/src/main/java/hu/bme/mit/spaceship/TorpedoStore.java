package hu.bme.mit.spaceship;

import java.util.Random;

/**
 * Class storing and managing the torpedos of a ship
 */
public class TorpedoStore {

	private int torpedos = 0;
	private Random generator = new Random();
	
	public TorpedoStore(int numberOfTorpedos){
		this.torpedos = numberOfTorpedos;
	}
	
	public void load(int torpedosToAdd){
		if(torpedosToAdd < 1){
			throw new IllegalArgumentException("torpedosToAdd");
		}
		
		this.torpedos += torpedosToAdd;
	}	
	
	public boolean fire(int numberOfTorpedos){
		if(numberOfTorpedos < 1 || numberOfTorpedos > this.torpedos){
			throw new IllegalArgumentException("numberOfTorpedos");
		}
		
		boolean success = false;
		
		//simulate random overheating of the launcher bay which prevents firing
		double r = generator.nextDouble();
		
		if (r > 0.1) {
			// successful firing
			this.torpedos -= numberOfTorpedos;
			success = true;			
		} else {
			// failure
			success = false;
		}
		
		return success;
	}
	
	public boolean isEmpty(){
		return (this.torpedos <= 0);
	}

	public int getNumberOfTorpedos() {
		return this.torpedos;
	}
}
