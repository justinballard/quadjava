// Justin Ballard's Quad 2 Assignment

import javax.swing.JOptionPane;

public class Quad2 {

	public static void main(String[] args) {
		System.out.println("Justin Ballard's Quad2");
		String message = "We are going to solve a quadratic equation! (e.g.: ax^2 + bx + c = 0)";
		JOptionPane.showMessageDialog(null, message);
		
		double theNum = -99.1345612356886;

		String a = JOptionPane.showInputDialog("Enter value for variable a. (NOTE: We can only use integers, such as 2, not two.)");
		try {
			theNum = Double.parseDouble(a);
		} catch (Exception e) {
			System.out.println("I'm sorry, that's not a number.");
			String errormsg = ("I'm sorry, that's not a number.");
			JOptionPane.showMessageDialog(null, errormsg);
		}
		String b = JOptionPane.showInputDialog("Enter value for variable b. (NOTE: We can only use integers, such as 2, not two.)");
		try {
			theNum = Double.parseDouble(b);
		} catch (Exception e) {
			System.out.println("I'm sorry, that's not a number.");
			String errormsg = ("I'm sorry, that's not a number.");
			JOptionPane.showMessageDialog(null, errormsg);
		}
		String c = JOptionPane.showInputDialog("Enter value for variable c. (NOTE: We can only use integers, such as 2, not two.)");
		try {
			theNum = Double.parseDouble(c);
		} catch (Exception e) {
			System.out.println("I'm sorry, that's not a number.");
			String errormsg = ("I'm sorry, that's not a number.");
			JOptionPane.showMessageDialog(null, errormsg);
		}

		double aInput = Double.parseDouble(a);
		double bInput = Double.parseDouble(b);
		double cInput = Double.parseDouble(c);
		double theAnswer1 = (-bInput + Math.sqrt(Math.pow(bInput, 2) - (4 * aInput * cInput))) / (2 * aInput);
		double theAnswer2 = (-bInput - Math.sqrt(Math.pow(bInput, 2) - (4 * aInput * cInput))) / (2 * aInput);
		double theDisc = ((Math.pow(bInput, 2) - (4 * aInput * cInput)));
		double real = -99.12312561;
		double complex = -99.781236612458;
				
		
		if (theDisc == 0) {
			System.out.println("There is one duplicated root of: " + theAnswer1);
			String result = "There is one duplicated root of: " + theAnswer1;
			JOptionPane.showMessageDialog(null,  result);
		}
			
		else if (theDisc > 0) {
			System.out.println("The roots are: " + theAnswer1 + ", " + theAnswer2);
			String answers = "The roots are: " + theAnswer1 + ", " + theAnswer2;
			JOptionPane.showMessageDialog(null,  answers);
			
		}
		else if (theDisc < 0) {
			real = -bInput/(2 * aInput);
			complex = Math.sqrt(-theDisc) / (2 * aInput);
			System.out.println("The complex roots are: " + real + " + " + complex + "i, " + real + " - " + complex + "i");
			String answers = "The complex roots are: " + real + " + " + complex + "i, " + real + " - " + complex + "i";
			JOptionPane.showMessageDialog(null, answers);
		}
		
		

	}

}
