package String_Builder;

// Fig. 16.13: StringBuilderAppend.java
// Métodos append de StringBuilder.

public class StringBuilderAppend 
{
   public static void main( String[] args )
   {
      Object refObjeto = "hola"; 
      String cadena = "adios";  
      char[] arregloChar = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean valorBoolean = true;
      char valorChar = 'Z';
      int valorInt = 7;
      long valorLong = 10000000000L;
      float valorFloat = 2.5f; 
      double valorDouble = 33.333;

      StringBuilder ultimoBufer = new StringBuilder( "ultimo bufer" );
      StringBuilder bufer = new StringBuilder();

      bufer.append( refObjeto );
      bufer.append( "\n" ); 
      bufer.append( cadena );
      bufer.append( "\n" );
      bufer.append( arregloChar );
      bufer.append( "\n" );
      bufer.append( arregloChar, 0, 3 );
      bufer.append( "\n" );
      bufer.append( valorBoolean );
      bufer.append( "\n" );
      bufer.append( valorChar );
      bufer.append( "\n" );
      bufer.append( valorInt );
      bufer.append( "\n" );
      bufer.append( valorLong );
      bufer.append( "\n" );
      bufer.append( valorFloat );
      bufer.append( "\n" );
      bufer.append( valorDouble );
      bufer.append( "\n" );
      bufer.append( ultimoBufer );

      System.out.printf( "bufer contiene %s\n", bufer.toString() );
   } // fin de main
} // fin de StringBuilderAppend

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
