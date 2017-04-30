package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(2200);
		driveDirect(0,500);
		sleep(550);
		driveDirect(500,500);
		sleep(2000);
		driveDirect(400,0);
		sleep(700);
		driveDirect(500,500);
		sleep(2500);
		driveDirect(0,400);
		sleep(700);
		driveDirect(500,500);
		sleep(2200);
		driveDirect(400,0);
		sleep(700);
		driveDirect(500,500);
	
	}

	public void loop() {
	
	}
}
