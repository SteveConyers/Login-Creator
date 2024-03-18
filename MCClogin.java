package MCClogin;

// MCClogin.java by Steven Conyers - 3/8/2022

/* This program demonstrates the StringBuilder class along with StringBuilder objects.
   It gets user input from keyboard from three different strings.
   It creates a user name by combining the first to inputs from the user using
   string builder append methods.
   Another output is for password from user input
   Program then outputs both created string in a single display message*/

import javax.swing.JOptionPane;

public class MCClogin {
	public static void main(String[] args) {
		// Declarations
		String first;
		String last;
		String stuNum;

		// Get user input
		first = JOptionPane.showInputDialog("Please enter your first name:");

		last = JOptionPane.showInputDialog("Please enter your last name:");

		stuNum = JOptionPane.showInputDialog("Please enter in your student number:");

		// StringBuilder for user name
		StringBuilder userName = new StringBuilder();

		userName.append(first.toLowerCase());
		userName.append(".");
		userName.append(last.toLowerCase());

		// StringBuilder for password
		StringBuilder password = new StringBuilder();

		password.insert(0, userName.charAt(0));
		password.insert(1, last.charAt(0));
		password.append(stuNum);
		password.append("!");

		// StringBuilder for message
		StringBuilder message = new StringBuilder();

		message.append("Your user name is ");
		message.append(userName);
		message.append(" and your password is ");
		message.append(password);

		// Output messages
		JOptionPane.showMessageDialog(null, "userName - " + userName);

		JOptionPane.showMessageDialog(null, "password - " + password);

		JOptionPane.showMessageDialog(null, message);

		// Close program
		System.exit(0);
	}
}