// Fig. 16.7: ConcatenacionString.java
// M�todo concat de String.

public class ConcatenacionString 
{
   public static void main( String[] args )
   {
      String s1 = new String( "Feliz " );
      String s2 = new String( "Cumpleanios" );

      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
      System.out.printf( 
         "Resultado de s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
      System.out.printf( "s1 despues de la concatenacion= %s\n", s1 );
   } // fin de main
} // fin de la clase ConcatenacionString

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

