

// Fig. 14.5: FileDemonstrationTest.java
// Testing the FileDemonstration class.
import java.util.Scanner;
import java.io.File;
import java.net.URI;

public class Test
{
   public static void main( String args[] )
   {
      try
      {
         File testFile = new File( "C:\\books\\2004\\sjhtp6e\\frame\\jhtp6_14_Files.fm" );
         System.out.println( testFile.toURI().toString() );
      }
      catch ( Exception exception )
      {
         System.out.println( "exception" );
      }
   } // end main
} // end class Test
