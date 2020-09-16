
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();

		// 1. Set the X position of the robot so that it starts on the left.
		rob.setX(100);

		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.
		rob.setSpeed(100);
		rob.penDown();

		for (int j = 0; j < 20; j++) {

			for (int i = 0; i < 5; i++) {

				rob.turn(144);
				rob.move(30);

			}
			rob.move(50);
		}
		

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
