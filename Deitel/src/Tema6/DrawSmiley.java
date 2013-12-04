package Tema6;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawSmiley extends JPanel{
	
	
	public void paintComponent (Graphics g){	
		super.paintComponents(g);
		
		//ROSTRO
		g.setColor( Color.YELLOW );
		g.fillOval( 10, 10, 200, 200 );
		//LOS OJOS
		g.setColor( Color.BLACK );
		g.fillOval( 55, 65, 30, 30 );
		g.fillOval( 135, 65, 30, 30 );
		g.fillOval( 50, 110, 120, 60 );
		g.setColor( Color.YELLOW );
		
		
		g.fillRect( 50, 110, 120, 30 );
		//g.fillOval( 50, 120, 120, 40 ); ORIGINAL
		g.fillOval( 50, 95, 120, 40 );
	}

}
