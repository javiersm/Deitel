// Fig. 16.2: VariosString.java
// Esta aplicaci�n demuestra los m�todos length, charAt y getChars
// de la clase String.

public class VariosString 
{
   public static void main( String[] args )
   {
      String s1 = "hola a todos";
      char[] arregloChar = new char[ 4 ];

      System.out.printf( "s1: %s", s1 );

      // prueba el m�todo length
      System.out.printf( "\nLongitud de s1: %d", s1.length() );

      // itera a trav�s de los caracteres en s1 con charAt y muestra la cadena invertida
      System.out.print( "\nLa cadena invertida es: " );

      for ( int cuenta= s1.length() - 1; cuenta>= 0; cuenta-- )
         System.out.printf( "%s ", s1.charAt( cuenta) );

      // copia los caracteres de la cadena a arregloChar
      s1.getChars( 0, 4, arregloChar, 0 );
      System.out.print( "\nEl arreglo de caracteres es: " );

      for ( char caracter : arregloChar )
         System.out.print( caracter );

      System.out.println();
   } // fin de main
} // fin de la clase VariosString

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
