package kunimi;

import robocode.Robot;

public class E000_AheadBackRobot extends Robot{

	@Override
	public void run() {
		ahead(300);
		back(300);
	}

}