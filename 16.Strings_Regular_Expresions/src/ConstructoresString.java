// Fig. 16.1: ConstructoresString.java
// Constructores de la clase String.

public class ConstructoresString 
{
   public static void main( String[] args )
   {
      char arregloChar[] = { 'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'n', 'i', 'o', 's' };
      String s = new String( "hola" );

      // usa los constructores de String
      String s1 = new String();
      String s2 = new String( s );
      String s3 = new String( arregloChar );
      String s4 = new String( arregloChar, 7, 5 );

      System.out.printf(
         "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", 
         s1, s2, s3, s4 ); // muestra las cadenas
   } // fin de main
} // fin de la clase ConstructoresString


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