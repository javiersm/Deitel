// Fig. 16.9: StringValueOf.java
// M�todos valueOf de String.

public class StringValueOf 
{
   public static void main( String[] args )
   {
      char[] arregloChar = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBoolean = true;
      char valorCaracter = 'Z';
      int valorEntero = 7;
      long valorLong = 10000000000L; // el sufijo L indica long
      float valorFloat = 2.5f; // f indica que 2.5 es un float
      double valorDouble = 33.333; // no hay sufijo, double es el predeterminado
      Object refObjeto = "hola"; // asigna la cadena a una referencia Object

      System.out.printf( 
         "arreglo de valores char = %s\n", String.valueOf( arregloChar ) );
      System.out.printf( "parte del arreglo char = %s\n", 
         String.valueOf( arregloChar, 3, 3 ) );
      System.out.printf( 
         "boolean = %s\n", String.valueOf( valorBoolean ) );
      System.out.printf( 
         "char = %s\n", String.valueOf( valorCaracter ) );
      System.out.printf( "int = %s\n", String.valueOf( valorEntero ) );
      System.out.printf( "long = %s\n", String.valueOf( valorLong ) ); 
      System.out.printf( "float = %s\n", String.valueOf( valorFloat ) ); 
      System.out.printf( 
         "double = %s\n", String.valueOf( valorDouble ) ); 
      System.out.printf( "Object = %s\n", String.valueOf( refObjeto ) );
   } // fin de main
} // fin de la clase StringValueOf

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
