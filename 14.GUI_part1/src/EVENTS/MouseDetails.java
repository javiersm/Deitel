package EVENTS;

//Fig. 14.32 | Test class for MouseDetailsFrame. (Part 1 of 2.)
//Fig. 14.31 | Left, center and right mouse-button clicks. (Part 2 of 2.)
import javax.swing.JFrame;

public class MouseDetails {
	public static void main(String[] args) {
		MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
		mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseDetailsFrame.setSize(400, 150); // set frame size
		mouseDetailsFrame.setVisible(true); // display frame
	} // end main
} // end class MouseDetails
