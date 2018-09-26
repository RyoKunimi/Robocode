package kunimi;

import java.awt.Color;

import robocode.Robot;

public class E030_CustomColorRobot extends Robot{

	@Override
	 public void run() {
		setAllColors(new Color(0, 125, 125));
		setRadarColor(Color.YELLOW);
		setGunColor(Color.BLACK);
		setBulletColor(Color.RED);
		while(true) {
			turnLeft(90);
			ahead(50);
			fire(3);
			turnLeft(90);
			ahead(30);
			turnLeft(20);
			ahead(40);
		}
	 }
}