package HassaniAva;
import robocode.*;

/**
 * Nibberli - a robot by (Hassani Ava)
 */

public class Nibberliii extends JuniorRobot
{
	/***
	 * run: Nibberli's default behavior
	 */
	public void run() {  
		setColors(purple, orange, white, black, red);
		
		 ahead(100);
		 turnRight(90);
		 turnGunLeft(200);
		 ahead(50);
         turnRight(20);
         ahead(100);
		 turnRight(90);
		 ahead(100);
		 turnRight(90);
		// Robot main loop
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}
	
 	 public void onScannedRobot() {
        turnGunTo(scannedAngle);
        fire(2);
	
	public void onHitByBullet() {
		turnAheadLeft(100, 90 - hitByBulletBearing);
		back(100);
	}
	
		public void onHitWall() {
		turnLeft(180);
	}	
}
 

