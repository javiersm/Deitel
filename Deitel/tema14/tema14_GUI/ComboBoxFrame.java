package tema14_GUI;

//Fig. 14.21: ComboBoxFrame.java
// JComboBox that displays a list of image names.
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	private JComboBox imagesJComboBox; // combobox to hold names of icons
	private JLabel label; // label to display selected icon

	private static final String[] names = { "rkt.png", "rkt2.png",
			"rocket.png", "rocket2.png" };
	private Icon[] icons = { 
			new ImageIcon(("/src/tema14_GUI/"+names[0])),
			new ImageIcon(("/src/tema14_GUI/"+names[1])),
			new ImageIcon(("/src/tema14_GUI/"+names[2])),
			new ImageIcon(("/src/tema14_GUI/"+names[3])) };

	// ComboBoxFrame constructor adds JComboBox to JFrame
	public ComboBoxFrame() {
		super("Testing JComboBox");
		setLayout(new FlowLayout()); // set frame layout

		imagesJComboBox = new JComboBox(names); // set up JComboBox
		imagesJComboBox.setMaximumRowCount(3); // display three rows
		
		label = new JLabel(icons[0]); // display first icon
		
		imagesJComboBox.addItemListener(
				new ItemListener() // anonymous inner // class
				{
					// handle JComboBox event
					public void itemStateChanged(ItemEvent event) {
						// determine whether item selected
						if (event.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icons[imagesJComboBox
									.getSelectedIndex()]);
							System.out.println("Seleccionado:"+imagesJComboBox
									.getSelectedIndex());
					} // end method itemStateChanged
				} // end anonymous inner class
				); // end call to addItemListener

		
		add(imagesJComboBox); // add combobox to JFrame
		//label = new JLabel(icons[2]); // display first icon
		add(label); // add label to JFrame
	} // end ComboBoxFrame constructor
} // end class ComboBoxFrame



