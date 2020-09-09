package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ElseIfOwnAdventure {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Do you want live in the country or beach?");
		if (input.equals("country")) {
			JOptionPane.showMessageDialog(null, "You have 3 horses and a farm.");
			input = JOptionPane.showInputDialog(null, "Do you want to wear a cowboy hat or a cowboy boots?");
			if (input.equals("cowboy hat")) {
				JOptionPane.showMessageDialog(null, "Great choice for your outfit!");

			}
			else {
				JOptionPane.showMessageDialog(null, "Those boots are looking great!");
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "You have 2 cars and 1 dog");

		}
		input = JOptionPane.showInputDialog(null, "What job do you want?");

		JOptionPane.showMessageDialog(null, "Thats awesome!");

	}

}