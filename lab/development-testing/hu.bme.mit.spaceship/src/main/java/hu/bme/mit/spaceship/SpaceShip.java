package hu.bme.mit.spaceship;

/**
 * Defines basic spaceship functionality 
 * (collects just the most important ones currently)
 */
public interface SpaceShip {

	/**
	 * Fires the lasers of the ship
	 * 
	 * @param firingMode how many lasers to fire
	 * @return was the firing successful
	 */
	public boolean fireLasers(FiringMode firingMode);
	
	/**
	 * Fires the torpedos of the ship
	 * 
	 * @param firingMode how many torpedo bays to fire
	 * @return whether the fire command was successful
	 */
	public boolean fireTorpedos(FiringMode firingMode);
}
