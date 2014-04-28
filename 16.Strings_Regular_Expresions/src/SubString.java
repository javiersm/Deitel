// Fig. 16.6: SubString.java
// Métodos substring de la clase String.

public class SubString 
{
   public static void main( String[] args )
   {
      String letras = "abcdefghijklmabcdefghijklm";

      // prueba los métodos substring
      System.out.printf( "La subcadena desde el indice 20 hasta el final es \"%s\"\n",
         letras.substring( 20 ) );
      System.out.printf( "%s \"%s\"\n", 
         "La subcadena desde el indice 3 hasta, pero sin incluir al 6 es",
         letras.substring( 3, 6 ) );
   } // fin de main
} // fin de la clase SubString


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
