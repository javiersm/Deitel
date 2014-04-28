package Pattern_Matcher_RegularExpresions;

// Fig. 16.21: Validacion.java
// Valida la información del usuario mediante expresiones regulares.
import java.util.Scanner;

public class Validacion
{
   public static void main( String[] args )
   {
      // obtiene la entrada del usuario
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Escriba el primer nombre:" );
      String primerNombre = scanner.nextLine();
      System.out.println( "Escriba el apellido paterno:" );
      String apellidoPaterno = scanner.nextLine();
      System.out.println( "Escriba la direccion:" );
      String direccion = scanner.nextLine();
      System.out.println( "Escriba la ciudad:" );
      String ciudad = scanner.nextLine();
      System.out.println( "Escriba el estado:" );
      String estado = scanner.nextLine();
      System.out.println( "Escriba el codigo postal:" );
      String cp = scanner.nextLine();
      System.out.println( "Escriba el telefono:" );
      String telefono = scanner.nextLine();

      // valida la entrada del usuario y muestra mensaje de error
      System.out.println( "\nValidar resultado:" );

      if ( !ValidacionEntrada.validarPrimerNombre( primerNombre ) )
         System.out.println( "Primer nombre invalido" );
      else if ( !ValidacionEntrada.validarApellidoPaterno( apellidoPaterno ) )
         System.out.println( "Apellido paterno invalido" );
      else if ( !ValidacionEntrada.validarDireccion( direccion ) )
         System.out.println( "Direccion invalida" );
      else if ( !ValidacionEntrada.validarCiudad( ciudad ) )
         System.out.println( "Ciudad invalida" );
      else if ( !ValidacionEntrada.validarEstado( estado ) )
         System.out.println( "Estado invalido" );
      else if ( !ValidacionEntrada.validarCP( cp ) )
         System.out.println( "Codigo postal invalido" );
      else if ( !ValidacionEntrada.validarTelefono( telefono ) )
         System.out.println( "Numero telefonico invalido" );
      else
         System.out.println( "La entrada es valida.  Gracias." );
   } // fin de main
} // fin de la clase Validacion

/*
 ***************************************************************************
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
 **************************************************************************
*/

