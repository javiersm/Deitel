package Tema7;

public class ArrayMultiArgumentos {

	
	// PASO MUCHOS ARGUMENTOS (SIN ESPECIFICAR CUANTOS LE PASO DEL MISMO TIPO)
	public static double average( double... numbers)
	{
		double total = 0.0; 
	
		for ( double d : numbers ){
			total += d;
		}
		return total / numbers.length;
	}
	
		
	
	public static void main(String[] args) {
		
		// LE PASO TODOS ESTOS ARGUMENTOS
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		
		
		System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4 );
		
		// LLAMO AL METODO PARA QUE SUME TODOS LOS DOUBLES QUE LE MANDO (los convierte a Array) Y ME CALCULA LA MEDIA
		System.out.printf( "Average of d1 and d2 is %.1f\n", average( d1, d2 ));
		System.out.printf( "Average of d1, d2 and d3 is %.1f\n", average( d1, d2, d3 ));
		System.out.printf( "Average of d1, d2, d3 and d4 is %.1f\n",average( d1, d2, d3, d4 ) );

	}

	
	
	
	
	
	
	
	
	
	
	
}
