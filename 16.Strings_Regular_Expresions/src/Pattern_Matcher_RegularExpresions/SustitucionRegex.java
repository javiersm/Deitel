package Pattern_Matcher_RegularExpresions;
// Fig. 16.23: SustitucionRegex.java
// Uso de los métodos replaceFirst, replaceAll y split.
import java.util.Arrays;

public class SustitucionRegex
{
   public static void main( String[] args )
   {
      String primeraCadena = "Este enunciado termina con 5 estrellas *****";
      String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";
         
      System.out.printf( "Cadena 1 original: %s\n", primeraCadena );

      // sustituye '*' con '^'
      primeraCadena = primeraCadena.replaceAll( "\\*", "^" );

      System.out.printf( "^ sustituyen a *: %s\n", primeraCadena );

      // sustituye 'estrellas' con 'intercaladores'
      primeraCadena = primeraCadena.replaceAll( "estrellas", "intercaladores" );

      System.out.printf(
         "\"intercaladores\" sustituye a \"estrellas\": %s\n", primeraCadena );

      // sustituye las palabras con 'palabra'
      System.out.printf( "Cada palabra se sustituye por \"palabra\": %s\n\n",
         primeraCadena.replaceAll( "\\w+", "palabra" ) );

      System.out.printf( "Cadena 2 original: %s\n", segundaCadena );

      // sustituye los primeros tres dígitos con 'digito'     
      for ( int i = 0; i < 3; i++ )
         segundaCadena = segundaCadena.replaceFirst( "\\d", "digito" );

      System.out.printf( 
         "Los primeros 3 digitos se sustituyeron por \"digito\" : %s\n", segundaCadena );
      System.out.print( "Cadena dividida en comas: " );

      String[] resultados = segundaCadena.split( ",\\s*" ); // se divide en las comas

      System.out.println( Arrays.toString( resultados ) );
   } // fin de main
} // fin de la clase SustitucionRegex

/*
 **************************************************************************
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
 **************************************************************************
*/


