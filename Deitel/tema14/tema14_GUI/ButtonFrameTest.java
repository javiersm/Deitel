package tema14_GUI;

import javax.swing.JFrame;

public class ButtonFrameTest {

	public static void main(String[] args) {
		ButtonFrame buttonFrame = new ButtonFrame(); // create ButtonFrame
		buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		buttonFrame.setSize( 1000, 900 ); // set frame size
		buttonFrame.setVisible( true ); // display frame

	}

}
