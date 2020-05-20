
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot S= new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i <4; i++) {
	S.penDown();
		
S.move(200);

S.turn(90);
		//3. Set the pen width to 10
S.setPenWidth(10);
		
		//4. Ask the user what color pen they would like the robot to draw with
String pen= JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
if (pen.equals("Red")){
	S.setPenColor(Color.red);
	}
	if(pen.equals("Green")) {
		S.setPenColor(Color.green);
	}
		if(pen.equals("Blue")) {
			S.setPenColor(Color.blue);
			
		}
		else { S.setRandomPenColor();
		}
		}
	

        //6. If the user doesn't enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		

	}

	}

