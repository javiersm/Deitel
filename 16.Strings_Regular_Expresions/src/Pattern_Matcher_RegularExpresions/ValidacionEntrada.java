package Pattern_Matcher_RegularExpresions;

// Fig. 16.20: ValidacionEntrada.java
// Valida la información del usuario mediante expresiones regulares.

public class ValidacionEntrada  
{
   // valida el primer nombre
   public static boolean validarPrimerNombre( String primerNombre )
   {
      return primerNombre.matches( "[A-Z][a-zA-Z]*" );
   } // fin del método validarPrimerNombre

   // valida el apellido
   public static boolean validarApellidoPaterno( String apellidoPaterno )
   {
      return apellidoPaterno.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // fin del método validarApellidoPaterno

   // valida la dirección
   public static boolean validarDireccion( String direccion )
   {
      return direccion.matches( 
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin del método validarDireccion

   // valida la ciudad
   public static boolean validarCiudad( String ciudad )
   {
      return ciudad.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin del método validarCiudad

   // valida el estado
   public static boolean validarEstado( String estado )
   {
      return estado.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // fin del método validarEstado

   // valida el código postal
   public static boolean validarCP( String cp )
   {
      return cp.matches( "\\d{5}" );
   } // fin del método validarCP

   // valida el teléfono
   public static boolean validarTelefono( String telefono )
   {
      return telefono.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // fin del método validarTelefono
} // fin de la clase ValidacionEntrada

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

