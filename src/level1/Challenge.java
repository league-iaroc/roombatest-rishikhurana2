package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		//write code here!
		driveDirect(500,500);
		sleep(2000);
		driveDirect(0,400);
		sleep(1000);
		driveDirect(500,500);
		sleep(7000);
		driveDirect(0,400);
		sleep(1000);
		driveDirect(1000,1000);
		
	}

	public void loop() {
	
	}
}
