// Fig. 16.3: CompararCadenas.java
// Los métodos equals, equalsIgnoreCase, compareTo y regionMatches de String.

public class CompararCadenas 
{
   public static void main( String[] args )
   {
      String s1 = new String( "hola" ); // s1 es una copia de "hola"
      String s2 = "adios";
      String s3 = "Feliz cumpleanios";
      String s4 = "feliz cumpleanios";

      System.out.printf( 
         "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n\n", s1, s2, s3, s4 );

      // prueba la igualdad
      if ( s1.equals( "hola" ) )  // true
         System.out.println( "s1 es igual a \"hola\"" );
      else
         System.out.println( "s1 no es igual a \"hola\"" ); 

      // prueba la igualdad con ==
      if ( s1 == "hola" )  // false; no son el mismo objeto
         System.out.println( "s1 es el mismo objeto que \"hola\"" );
      else
         System.out.println( "s1 no es el mismo objeto que \"hola\"" );

      // prueba la igualdad (ignora el uso de mayúsculas/minúsculas)
      if ( s3.equalsIgnoreCase( s4 ) )  // true
         System.out.printf( "%s es igual a %s si se ignora el uso de mayusculas/minusculas\n", s3, s4 );
      else
         System.out.println( "s3 no es igual a s4" );

      // prueba con compareTo
      System.out.printf( 
         "\ns1.compareTo( s2 ) es %d", s1.compareTo( s2 ) );
      System.out.printf( 
         "\ns2.compareTo( s1 ) es %d", s2.compareTo( s1 ) );
      System.out.printf( 
         "\ns1.compareTo( s1 ) es %d", s1.compareTo( s1 ) );
      System.out.printf(
         "\ns3.compareTo( s4 ) es %d", s3.compareTo( s4 ) );
      System.out.printf(
         "\ns4.compareTo( s3 ) es %d\n\n", s4.compareTo( s3 ) );

      // prueba con regionMatches (sensible a mayúsculas/minúsculas)
      if ( s3.regionMatches( 0, s4, 0, 5 ) )
         System.out.println( 
            "Los primeros 5 caracteres de s3 y s4 coinciden" );
      else
         System.out.println( 
            "Los primeros 5 caracteres de s3 y s4 no coinciden" );

      // prueba con regionMatches (ignora el uso de mayúsculas/minúsculas)
      if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
         System.out.println( "Los primeros 5 caracteres de s3 y s4 coinciden" );
      else
         System.out.println( 
            "Los primeros 5 caracteres de s3 y s4 no coinciden" );
   } // fin de main
} // fin de la clase CompararCadenas


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
