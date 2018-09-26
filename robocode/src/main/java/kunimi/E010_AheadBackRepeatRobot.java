package kunimi;

import robocode.Robot;

public class E010_AheadBackRepeatRobot extends Robot{

	@Override
	public void run() {
		while(true) {
			ahead(300);
			back(300);
		}
	}

}