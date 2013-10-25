package Deitel.Ejercicios.Tema3;


import javax.swing.JFrame;

public class LineaGraficas  {

	public static void main(String[] args) {
		
		//AQUÍ HE CREADO UN PANEL DONDE PUEDO METER "FRAMES" (imagenes)		
		JFrame frame = new JFrame("puedo meterle dibujos y/o Objetos");
		
		//Ask for window decorations provided by the look and feel.
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(480,450);
		
		
		// HASTA AQUÍ HE CREADO UN PANEL DONDE PUEDO METER "FRAMES" (imagenes)
		
		
		//VOY A METER UNA IMAGEN EN MI FRAME
		//creo una clase DrawPanel que ya tiene un dibujo creado de una X y se la añado a mi clase frame
		
		DrawPanel panelDibujo = new DrawPanel();
		
		
		//añado la imagen 
		frame.add(panelDibujo);
		frame.setVisible(true);
		frame.validate();
		System.out.println("No hay nada dentro de frame");
		
		
		
		
		
	}

}
