package String_Builder;

// Fig. 16.10: ConstructoresStringBuilder.java
// Constructores de StringBuilder.

public class ConstructoresStringBuilder 
{
   public static void main( String[] args )
   {
      StringBuilder bufer1 = new StringBuilder();
      StringBuilder bufer2 = new StringBuilder( 10 );
      StringBuilder bufer3 = new StringBuilder( "hola" );

      System.out.printf( "bufer1 = \"%s\"\n", bufer1.toString() );
      System.out.printf( "bufer2 = \"%s\"\n", bufer2.toString() );
      System.out.printf( "bufer3 = \"%s\"\n", bufer3.toString() );
   } // fin de main
} // fin de la clase ConstructoresStringBuilder


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
