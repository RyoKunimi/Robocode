package kunimi;

import robocode.Robot;

public class SampleRobot extends Robot{
	@Override
	public void run() {
			int i = 90;
			ahead(300);
			turnLeft(i);
	}
}