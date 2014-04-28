package Pattern_Matcher_RegularExpresions;

// Fig. 16.20: ValidacionEntrada.java
// Valida la informaci�n del usuario mediante expresiones regulares.

public class ValidacionEntrada  
{
   // valida el primer nombre
   public static boolean validarPrimerNombre( String primerNombre )
   {
      return primerNombre.matches( "[A-Z][a-zA-Z]*" );
   } // fin del m�todo validarPrimerNombre

   // valida el apellido
   public static boolean validarApellidoPaterno( String apellidoPaterno )
   {
      return apellidoPaterno.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // fin del m�todo validarApellidoPaterno

   // valida la direcci�n
   public static boolean validarDireccion( String direccion )
   {
      return direccion.matches( 
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin del m�todo validarDireccion

   // valida la ciudad
   public static boolean validarCiudad( String ciudad )
   {
      return ciudad.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // fin del m�todo validarCiudad

   // valida el estado
   public static boolean validarEstado( String estado )
   {
      return estado.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // fin del m�todo validarEstado

   // valida el c�digo postal
   public static boolean validarCP( String cp )
   {
      return cp.matches( "\\d{5}" );
   } // fin del m�todo validarCP

   // valida el tel�fono
   public static boolean validarTelefono( String telefono )
   {
      return telefono.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // fin del m�todo validarTelefono
} // fin de la clase ValidacionEntrada

/*
 ***************************************************************************
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
 **************************************************************************
*/

