package Pattern_Matcher_RegularExpresions;

// Fig. 16.24: ConcordanciasRegex.java
// Clases Pattern y Matcher.
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcordanciasRegex
{
   public static void main( String[] args )
   {
      // crea la expresión regular
      Pattern expresion = 
         Pattern.compile( "J.*\\d[0-35-9]-\\d\\d-\\d\\d" );
      
      String cadena1 = "Jane nacio el 05-12-75\n" +
         "Dave nacio el 11-04-68\n" +
         "John nacio el 04-28-73\n" +
         "Joe nacio el 12-17-77";

      // compara la expresión regular con la cadena e imprime las concordancias
      Matcher matcher = expresion.matcher( cadena1 );
        
      while ( matcher.find() )
         System.out.println( matcher.group() );
   } // fin de main
} // fin de la clase ConcordanciasRegex


/*
 **************************************************************************
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

