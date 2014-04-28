// Fig. 16.15: MetodosStaticChar.java
// Los m�todos static de Character para probar caracteres y conversi�n de may�sculas/min�sculas.
import java.util.Scanner;

public class MetodosStaticChar 
{
   public static void main( String[] args )
   {
      Scanner scanner = new Scanner( System.in ); // crea objeto scanner
      System.out.println( "Escriba un caracter y oprima Intro" );
      String entrada = scanner.next(); 
      char c = entrada.charAt( 0 ); // obtiene el caracter de entrada

      // muestra informaci�n sobre los caracteres
      System.out.printf( "esta definido: %b\n", Character.isDefined( c ) );
      System.out.printf( "es digito: %b\n", Character.isDigit( c ) );
      System.out.printf( "es el primer caracter en un identificador de Java: %b\n",
         Character.isJavaIdentifierStart( c ) );
      System.out.printf( "es parte de un identificador de Java: %b\n",
         Character.isJavaIdentifierPart( c ) );
      System.out.printf( "es letra: %b\n", Character.isLetter( c ) );
      System.out.printf( 
         "es letra o digito: %b\n", Character.isLetterOrDigit( c ) );
      System.out.printf(
         "es minuscula: %b\n", Character.isLowerCase( c ) );
      System.out.printf( 
         "es mayuscula: %b\n", Character.isUpperCase( c ) );
      System.out.printf( 
         "a mayuscula: %s\n", Character.toUpperCase( c ) );
      System.out.printf( 
         "a minuscula: %s\n", Character.toLowerCase( c ) );
   } // fin de main
} // fin de la clase MetodosStaticChar

/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
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