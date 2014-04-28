package String_Builder;

// Fig. 16.10: ConstructoresStringBuilder.java
// Constructores de StringBuilder.

public class ConstructoresStringBuilder 
{
   public static void main( String[] args )
   {
      StringBuilder bufer1 = new StringBuilder();
      StringBuilder bufer2 = new StringBuilder( 10 );
      StringBuilder bufer3 = new StringBuilder( "hola" );

      System.out.printf( "bufer1 = \"%s\"\n", bufer1.toString() );
      System.out.printf( "bufer2 = \"%s\"\n", bufer2.toString() );
      System.out.printf( "bufer3 = \"%s\"\n", bufer3.toString() );
   } // fin de main
} // fin de la clase ConstructoresStringBuilder


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
