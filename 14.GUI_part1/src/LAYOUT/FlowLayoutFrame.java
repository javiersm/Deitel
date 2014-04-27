package LAYOUT;

//Fig. 14.39: FlowLayoutFrame.java
// Demonstrating FlowLayout alignments.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {
	private JButton leftJButton; // button to set alignment left
	private JButton centerJButton; // button to set alignment center
	private JButton rightJButton; // button to set alignment right
	private FlowLayout layout; // layout object
	private Container container; // container to set layout

	// set up GUI and register button listeners
	public FlowLayoutFrame() {
		super("FlowLayout Demo");

		layout = new FlowLayout(); // create FlowLayout
		container = getContentPane(); // get container to layout
		setLayout(layout); // set frame layout

		// set up leftJButton and register listener
		leftJButton = new JButton("Left"); // create Left button
		add(leftJButton); // add Left button to frame
		leftJButton.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						// realign attached components
						layout.layoutContainer(container);
					}
				}); // end call to addActionListener

		
		// set up centerJButton and register listener
		centerJButton = new JButton("Center");
		add(centerJButton); 
		centerJButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
				layout.setAlignment(FlowLayout.CENTER);
				// realign attached components
				layout.layoutContainer(container);
			} 
		}); // end call to addActionListener

		
		// set up rightJButton and register listener
		rightJButton = new JButton("Right");
		add(rightJButton); 
		rightJButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
				layout.setAlignment(FlowLayout.RIGHT);
				// realign attached components
				layout.layoutContainer(container);
			} 
		}); // end call to addActionListener
	
	
	} // end FlowLayoutFrame constructor
} // end class FlowLayoutFrame