// Fig. 16.4: CadenaInicioFin.java
// Los m�todos startsWith y endsWith de String.

public class CadenaInicioFin 
{
   public static void main( String[] args )
   {
      String[] cadenas = { "empezo", "empezando", "termino", "terminando" };

      // prueba el m�todo startsWith
      for ( String cadena: cadenas )
      {
         if ( cadena.startsWith( "em" ) )
            System.out.printf( "\"%s\" empieza con \"em\"\n", cadena);
      } // fin de for

      System.out.println();

      // prueba el m�todo startsWith empezando desde la posici�n 2 de la cadena
      for ( String cadena: cadenas )
      {
         if ( cadena.startsWith( "pez", 2 ) ) 
            System.out.printf( 
               "\"%s\" empieza con \"pez\" en la posicion 2\n", cadena);
      } // fin de for

      System.out.println();

      // prueba el m�todo endsWith
      for ( String cadena: cadenas )
      {
         if ( cadena.endsWith( "do" ) )
            System.out.printf( "\"%s\" termina con \"do\"\n", cadena);
      } // fin de for
   } // fin de main
} // fin de la clase CadenaInicioFin

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
