// Fig. 16.16: MetodosStaticChar2.java
// M�todos de conversi�n est�ticos de la clase Character.
import java.util.Scanner;

public class MetodosStaticChar2 
{
   // ejecuta la aplicaci�n
   public static void main( String[] args )
   {
      Scanner scanner = new Scanner( System.in );

      // obtiene la ra�z
      System.out.println( "Escriba una raiz:" );
      int raiz = scanner.nextInt();

      // obtiene la selecci�n del usuario
      System.out.printf( "Seleccione una opcion:\n1 -- %s\n2 -- %s\n",
         "Convertir digito a caracter", "Convertir caracter a digito" );
      int opcion = scanner.nextInt(); 

      // procesa la petici�n
      switch ( opcion )
      {
         case 1: // convierte d�gito a car�cter
            System.out.println( "Escriba un digito:" );
            int digito = scanner.nextInt();
            System.out.printf( "Convertir digito a caracter: %s\n",
               Character.forDigit( digito, raiz ) );
            break;

         case 2: // convierte car�cter a d�gito
            System.out.println( "Escriba un caracter:" );
            char caracter = scanner.next().charAt( 0 );
            System.out.printf( "Convertir caracter a digito: %s\n",
               Character.digit( caracter, raiz ) );
            break;
      } // fin de switch
   } // fin de main
} // fin de la clase MetodosStaticChar2

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