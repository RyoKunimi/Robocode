package kunimi;

import robocode.Robot;

public class E020_RectangleAheadRobot extends Robot{

	@Override
	public void run() {
		while(true) {
			ahead(300);
			turnRight(90);
		}
	}

}