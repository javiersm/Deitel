package tema17;

// Fig. 14.9: CreateTextFileTest.java
// Testing the CreateTextFile class.

public class CreateTextFileTest
{
   public static void main( String args[] )
   {
      CreateTextFile application = new CreateTextFile();

      application.openFile();
      application.addRecords();
      application.closeFile();
   } // end main
} // end class CreateTextFileTest

/*************************************************************************
* Nota: Funciona correctamente. Se crea el archivo en el directorio raiz dnd esta el "src","bin", etc
*************************************************************************/