package String_Builder;

// Fig. 16.14: StringBuilderInsertDelete.java
// M�todos insert, delete y deleteCharAt de StringBuilder

public class StringBuilderInsertDelete
{
   public static void main( String[] args )
   {
      Object refObjeto = "hola";  
      String cadena = "adios";  
      char[] arregloChars = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBoolean = true;
      char valorChar = 'K';
      int valorInt = 7;
      long valorLong = 10000000;
      float valorFloat = 2.5f; // el sufijo f indica que 2.5 es un float
      double valorDouble = 33.333;

      StringBuilder bufer = new StringBuilder();

      bufer.insert( 0, refObjeto );
      bufer.insert( 0, "  " ); // cada uno de estos contiene dos espacios
      bufer.insert( 0, cadena );
      bufer.insert( 0, "  " );
      bufer.insert( 0, arregloChars );
      bufer.insert( 0, "  " );
      bufer.insert( 0, arregloChars, 3, 3 );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorBoolean );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorChar );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorInt );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorLong );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorFloat );
      bufer.insert( 0, "  " );
      bufer.insert( 0, valorDouble );

      System.out.printf( 
         "bufer despues de insertar:\n%s\n\n", bufer.toString() );

      bufer.deleteCharAt( 10 ); // elimina el 5 en 2.5
      bufer.delete( 2, 6 ); // elimina el .333 en 33.333

      System.out.printf( 
         "bufer despues de eliminar:\n%s\n", bufer.toString() );
   } // fin de main
} // fin de la clase StringBuilderInsertDelete

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