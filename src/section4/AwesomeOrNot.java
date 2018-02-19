package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below…
	int r=new Random().nextInt(4);
	System.out.println(r);
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
String answer=JOptionPane.showInputDialog("What is awesome?");
if(r==0) {JOptionPane.showMessageDialog(null,answer+ " Phobos");
	

}
	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(r==1) {JOptionPane.showMessageDialog(null,answer+ " Black Holes");}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(r==2) {JOptionPane.showMessageDialog(null,answer+ " White Dwarf");}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if(r==3) {JOptionPane.showMessageDialog(null,answer+ " Blue Hypergiant");}
	// -- write your own answer

}
}



