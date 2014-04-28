// Fig. 16.4: CadenaInicioFin.java
// Los métodos startsWith y endsWith de String.

public class CadenaInicioFin 
{
   public static void main( String[] args )
   {
      String[] cadenas = { "empezo", "empezando", "termino", "terminando" };

      // prueba el método startsWith
      for ( String cadena: cadenas )
      {
         if ( cadena.startsWith( "em" ) )
            System.out.printf( "\"%s\" empieza con \"em\"\n", cadena);
      } // fin de for

      System.out.println();

      // prueba el método startsWith empezando desde la posición 2 de la cadena
      for ( String cadena: cadenas )
      {
         if ( cadena.startsWith( "pez", 2 ) ) 
            System.out.printf( 
               "\"%s\" empieza con \"pez\" en la posicion 2\n", cadena);
      } // fin de for

      System.out.println();

      // prueba el método endsWith
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
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
