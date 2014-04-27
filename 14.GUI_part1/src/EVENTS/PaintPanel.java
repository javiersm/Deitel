package EVENTS;

// Fig. 14.34: PaintPanel.java
// Using class MouseMotionAdapter.
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int pointCount = 0; // count number of points

	// Fig. 14.34 | Adapter class used to implement event handlers. (Part 1 of
	// 2.)
	// array of 10000 java.awt.Point references
	private Point[] points = new Point[10000];

	// set up GUI and register mouse event handler
	public PaintPanel() {
		// handle frame mouse motion event
		addMouseMotionListener(new MouseMotionAdapter()
		// anonymous inner class
		{
			// store drag coordinates and repaint
			public void mouseDragged(MouseEvent event) {
				if (pointCount < points.length) {
					points[pointCount] = event.getPoint(); // find point
					++pointCount; // increment number of points in array
					System.out.println("PointCount:"+pointCount);
					repaint(); // repaint JFrame
				} // end if
			} // end method mouseDragged

		} // end anonymous inner class
		); // end call to addMouseMotionListener
	} // end PaintPanel constructor

	// draw ovals in a 4-by-4 bounding box at specified locations on window
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area
		
		// draw all points in array
		for (int i = 0; i < pointCount; i++)
			g.fillOval(points[i].x, points[i].y, 4, 4);
	} // end method paintComponent
} // end class PaintPanel