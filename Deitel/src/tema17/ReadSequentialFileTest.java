package tema17;

// Fig. 14.21: ReadSequentialFileTest.java
// This program test class ReadSequentialFile.

public class ReadSequentialFileTest
{
   public static void main( String args[] )
   {
      ReadSequentialFile application = new ReadSequentialFile();

      application.openFile();
      application.readRecords();
      application.closeFile();
   } // end main
} // end class ReadSequentialFileTest

