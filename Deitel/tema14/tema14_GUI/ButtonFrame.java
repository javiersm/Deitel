package tema14_GUI;

// Fig. 14.15: ButtonFrame.java
// Creating JButtons.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private JButton plainJButton; // button with just text
	private JButton fancyJButton; // button with icons

	// ButtonFrame adds JButtons to JFrame
	public ButtonFrame() {
		super("Testing Buttons");
		setLayout(new FlowLayout()); // set frame layout
		
		plainJButton = new JButton("Plain Button"); // button with text
		add(plainJButton); // add plainJButton to JFrame
	
		Icon bug1 = new ImageIcon("src/tema14_GUI/rkt.png");
		Icon bug2 = new ImageIcon("src/tema14_GUI/rkt2.png");
		//Icon bug1 = new ImageIcon(getClass().getResource("rkt.png"));
		//Icon bug2 = new ImageIcon(getClass().getResource("rkt2.png"));
		//fancyJButton = new JButton("Fancy Button", bug1); // set image
		fancyJButton = new JButton("btnCohete", bug1); // set image
		fancyJButton.setIcon(bug1);
		fancyJButton.setRolloverIcon(bug2); // set rollover image
		add(fancyJButton); // add fancyJButton to JFrame
	
		// create new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	} // end ButtonFrame constructor

	
	
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
		// handle button event
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(ButtonFrame.this,     //ButtonFrame.this (Hace que la ventana aparezca centrada)
					String.format("You pressed: %s", event.getActionCommand()));
		} // end method actionPerformed
	} // end private inner class ButtonHandler
} // end class ButtonFrame