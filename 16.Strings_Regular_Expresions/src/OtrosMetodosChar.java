// Fig. 16.17: OtrosMetodosChar.java
// M�todos no static de la clase Character.
public class OtrosMetodosChar 
{
   public static void main( String[] args )
   {
      Character c1 = 'A';
      Character c2 = 'a';

      System.out.printf( 
         "c1 = %s\nc2 = %s\n\n", c1.charValue(), c2.toString() );

      if ( c1.equals( c2 ) )
         System.out.println( "c1 y c2 son iguales\n" );
      else
         System.out.println( "c1 y c2 no son iguales\n" );
   } // fin de main
} // fin de la clase OtrosMetodosChar

/**************************************************************************
 * (C) Copyright 1992-20|1 por Deitel & Associates, Inc. y                *
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