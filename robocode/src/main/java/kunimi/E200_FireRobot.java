package kunimi;

import java.awt.Color;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class E200_FireRobot extends Robot{

	@Override
	 public void run() {
		setAllColors(new Color(0, 125, 125));
		setRadarColor(Color.YELLOW);
		setGunColor(Color.BLACK);
		setBulletColor(Color.RED);
		double i = 0.0;
		while(true) {
			double gunHeat = getGunHeat();
			if(gunHeat > 0) {
				doNothing();
				continue;
			}
			turnLeft(300);
			ahead(100);
			if(i > 3.0) {
				i = 0.5;
			}
			fire(i);
			i += 0.5;
		}
	 }

	@Override
	public void onScannedRobot(ScannedRobotEvent event) {
		fire(20);
	}
}