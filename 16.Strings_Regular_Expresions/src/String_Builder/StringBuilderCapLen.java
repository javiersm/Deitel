package String_Builder;

// Fig. 16.11: StringBuilderCapLen.java
// M�todos length, setLength, capacity y ensureCapacity de StringBuilder.

public class StringBuilderCapLen 
{
   public static void main( String[] args )
   {
      StringBuilder bufer = new StringBuilder( "Hola, como estas?" );

      System.out.printf( "bufer = %s\nlongitud = %d\ncapacidad = %d\n\n",
         bufer.toString(), bufer.length(), bufer.capacity() );

      bufer.ensureCapacity( 75 );
      System.out.printf( "Nueva capacidad = %d\n\n", bufer.capacity() );

      bufer.setLength( 10 );
      System.out.printf( "Nueva longitud = %d\nbufer = %s\n", 
         bufer.length(), bufer.toString() );
   } // fin de main
} // fin de la clase StringBuilderCapLen


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
