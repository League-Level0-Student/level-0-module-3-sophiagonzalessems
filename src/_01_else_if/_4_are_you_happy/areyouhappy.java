package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog(null,"Are you happy?");
	if(input.equals("yes")) {
		JOptionPane.showMessageDialog(null,"You can continue with what you are doing.");
	}
	else {
		input=JOptionPane.showInputDialog(null,"Do you want to be happy?");
		if(input.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Change Something");
		
		}
		else {
			JOptionPane.showMessageDialog(null,"You can continue with what you are doing");
		}
	}
		
	}
	
}
