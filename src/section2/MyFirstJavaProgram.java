package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot brad=new Robot();
	brad.penDown();
	brad.setSpeed(100);
		for(int i=0;i<999;i++) {
			brad.move(90);
			brad.turn(80);
		}
	}
}
