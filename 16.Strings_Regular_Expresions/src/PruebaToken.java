// Fig. 16.18: PruebaToken.java
// Uso de un objeto StringTokenizer para descomponer objetos String en tokens.
import java.util.Scanner;
import java.util.StringTokenizer;

public class PruebaToken 
{
   // ejecuta la aplicación
   public static void main( String[] args )
   {
      // obtiene el enunciado
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Escriba un enunciado y oprima Intro" );
      String enunciado = scanner.nextLine();

      // procesa el enunciado del usuario
      String[] tokens = enunciado.split( " " );
      System.out.printf( "Numero de elementos: %d\nLos tokens son:\n",
         tokens.length );

      for ( String token : tokens )
         System.out.println( token );
   } // fin de main
} // fin de la clase PruebaToken

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