package hu.bme.mit.swsv;

/*
 * Motor moving the windshield wipers.
 */
public interface WiperMotor {

	/*
	 * Sets the interval in seconds between two wipes.
	 * 
	 * Value 0 means stopping the wipers.
	 */
	public void setInterval(double interval);
	
}
