package Deitel.Ejercicios.Tema3;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


//JPanel is a generic lightweight container
public class DrawPanel extends JPanel{

	public void PaintComponent (Graphics g){
		
		super.paintComponents(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine( 0, 0, width, height );
		g.drawLine( 0, height, width, 0 );  //dibuja las lineas
		
		g.drawLine(30,40 , 100, 100);
		g.setColor(Color.BLACK);
		
		
	}
	
	
}
