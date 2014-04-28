package String_Builder;

// Fig. 16.12: StringBuilderChars.java
// M�todos charAt, setCharAt, getChars y reverse de StringBuilder.

public class StringBuilderChars 
{
   public static void main( String[] args )
   {
      StringBuilder bufer = new StringBuilder( "hola a todos" );

      System.out.printf( "bufer = %s\n", bufer.toString() );
       System.out.printf( "Caracter en 0: %s\nCaracter en 3: %s\n\n", 
         bufer.charAt( 0 ), bufer.charAt( 3 ) );

      char[] arregloChars = new char[ bufer.length() ];
      bufer.getChars( 0, bufer.length(), arregloChars, 0 );
      System.out.print( "Los caracteres son: " );

      for ( char character : arregloChars )
         System.out.print( character );

      bufer.setCharAt( 0, 'H' );
      bufer.setCharAt( 7, 'T' );
      System.out.printf( "\n\nbufer = %s", bufer.toString() );

      bufer.reverse();
      System.out.printf( "\n\nbufer = %s\n", bufer.toString() );
   } // fin de main
} // fin de la clase StringBuilderChars


/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
