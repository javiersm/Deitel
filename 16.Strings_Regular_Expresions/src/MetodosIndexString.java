// Fig. 16.5: MetodosIndexString.java
// Métodos indexOf y lastIndexOf para buscar en cadenas.

public class MetodosIndexString 
{
   public static void main( String[] args )
   {
      String letras = "abcdefghijklmabcdefghijklm";

      // prueba indexOf para localizar un carácter en una cadena
      System.out.printf( 
         "'c' se encuentra en el indice %d\n", letras.indexOf( 'c' ) );
      System.out.printf(
         "'a' se encuentra en el indice %d\n", letras.indexOf( 'a', 1 ) );
      System.out.printf(
         "'$' se encuentra en el indice %d\n\n", letras.indexOf( '$' ) );

      // prueba lastIndexOf para buscar un carácter en una cadena
      System.out.printf( "La ultima 'c' se encuentra en el indice %d\n",
         letras.lastIndexOf( 'c' ) );
      System.out.printf( "La ultima 'a' se encuentra en el indice %d\n",
         letras.lastIndexOf( 'a', 25 ) );
      System.out.printf( "La ultima '$' se encuentra en el indice %d\n\n",
         letras.lastIndexOf( '$' ) );

      // prueba indexOf para localizar una subcadena en una cadena
      System.out.printf( "\"def\" se encuentra en el indice %d\n", 
         letras.indexOf( "def" ) );
      System.out.printf( "\"def\" se encuentra en el indice %d\n",
         letras.indexOf( "def", 7 ) );
      System.out.printf( "\"hola\" se encuentra en el indice %d\n\n",
         letras.indexOf( "hola" ) );

      // prueba lastIndexOf para buscar una subcadena en una cadena
      System.out.printf( "La ultima ocurrencia de \"def\" se encuentra en el indice %d\n",
         letras.lastIndexOf( "def" ) );
      System.out.printf( "La ultima ocurrencia de \"def\" se encuentra en el indice %d\n",
         letras.lastIndexOf( "def", 25 ) );
      System.out.printf( "La ultima ocurrencia de \"hola\" se encuentra en el indice %d\n",
         letras.lastIndexOf( "hola" ) );
   } // fin de main
} // fin de la clase MetodosIndexString

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
