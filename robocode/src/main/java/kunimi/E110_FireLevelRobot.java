package kunimi;

import java.awt.Color;

import robocode.Robot;

public class E110_FireLevelRobot extends Robot{

	@Override
	 public void run() {
		setAllColors(new Color(0, 125, 125));
		setRadarColor(Color.YELLOW);
		setGunColor(Color.BLACK);
		setBulletColor(Color.RED);
		while(true) {
			fire(0.5);
			turnLeft(5);
		}
	 }
}