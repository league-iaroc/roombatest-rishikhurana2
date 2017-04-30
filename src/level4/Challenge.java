package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
	

	}

	public void loop() {
		driveDirect(500,500);
		sleep(1000);
		driveDirect(0,400);
		if(isBumpedRight()){
			driveDirect(500,500);
			sleep(1000);
			}
		driveDirect(400,0);
		
		if(isBumpedRight()){
		driveDirect(500,500);
		}
	}
}
