
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String Age = "";
		int age = 0;
		String Year = "";
		int year = 0;
		int born = 0;
		String a = "";
		Age = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(Age);
		Year = JOptionPane.showInputDialog("In what year was your most recent birth day?");
		year = Integer.parseInt(Year);
		born = year - age;
		if (born <= 0) {
			born = (born * -1) + 1;
			a = " BC";
		}
		JOptionPane.showMessageDialog(null, "You were born in " + born + a + ".");
		if (age > 30) {
			JOptionPane.showMessageDialog(null, "You are too old to play this game.");
		}
	}
}
