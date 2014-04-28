// Fig. 16.8: VariosString2.java
// M�todos replace, toLowerCase, toUpperCase, trim y toCharArray de String.

public class VariosString2 
{
   public static void main( String[] args )
   {
      String s1 = new String( "hola" );
      String s2 = new String( "ADIOS" );
      String s3 = new String( "   espacios   " );

      System.out.printf( "s1 = %s\ns2 = %s\ns3 = %s\n\n", s1, s2, s3 );

      // prueba del m�todo replace      
      System.out.printf( 
         "Remplazar 'l' con 'L' en s1: %s\n\n", s1.replace( 'l', 'L' ) );

      // prueba de toLowerCase y toUpperCase
      System.out.printf( "s1.toUpperCase() = %s\n", s1.toUpperCase() );
      System.out.printf( "s2.toLowerCase() = %s\n\n", s2.toLowerCase() );

      // prueba del m�todo trim
      System.out.printf( "s3 despues de trim = \"%s\"\n\n", s3.trim() );

      // prueba del m�todo toCharArray
      char arregloChar[] = s1.toCharArray();
      System.out.print( "s1 como arreglo de caracteres = " );

      for ( char caracter : arregloChar )
         System.out.print( caracter );

      System.out.println();
   } // fin de main
} // fin de la clase VariosString2

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
