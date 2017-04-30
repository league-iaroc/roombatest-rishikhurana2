package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(500,500);
		sleep(3200);
		driveDirect(0,400);
		sleep(700);
		driveDirect(500,500);
		sleep(5000);
		driveDirect(400,0);
		sleep(700);
		driveDirect(500,500);

	}

	public void loop() {
	
	}
}
