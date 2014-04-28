// Fig. 16.16: MetodosStaticChar2.java
// Métodos de conversión estáticos de la clase Character.
import java.util.Scanner;

public class MetodosStaticChar2 
{
   // ejecuta la aplicación
   public static void main( String[] args )
   {
      Scanner scanner = new Scanner( System.in );

      // obtiene la raíz
      System.out.println( "Escriba una raiz:" );
      int raiz = scanner.nextInt();

      // obtiene la selección del usuario
      System.out.printf( "Seleccione una opcion:\n1 -- %s\n2 -- %s\n",
         "Convertir digito a caracter", "Convertir caracter a digito" );
      int opcion = scanner.nextInt(); 

      // procesa la petición
      switch ( opcion )
      {
         case 1: // convierte dígito a carácter
            System.out.println( "Escriba un digito:" );
            int digito = scanner.nextInt();
            System.out.printf( "Convertir digito a caracter: %s\n",
               Character.forDigit( digito, raiz ) );
            break;

         case 2: // convierte carácter a dígito
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
 * investigación y prueba de las teorías y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garantía de      *
 * ningún tipo, expresa o implícita, en relación con estos programas o    *
 * con la documentación contenida en estos libros. Los autores y el       *
 * editor no serán responsables en ningún caso por los daños consecuentes *
 * en conexión con, o que surjan de, el suministro, desempeño o uso de    *
 * estos programas.                                                       *
 *************************************************************************/