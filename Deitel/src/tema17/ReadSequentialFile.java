package tema17;

// Fig. 14.20: ReadSequentialFile.java
// This program reads a file of objects sequentially
// and displays each record.
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import tema17.AccountRecordSerializable;

public class ReadSequentialFile
{
   private ObjectInputStream input;

   // enable user to select file to open
   public void openFile()
   {
      try // open file
      {
         input = new ObjectInputStream(
            new FileInputStream( "clientsSerialized.ser" ) );
      } // end try
      catch ( IOException ioException )
      {
         System.err.println( "Error opening file." );
      } // end catch
   } // end method openFile

   // read record from file
   public void readRecords()
   {
      AccountRecordSerializable record;
      System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
         "First Name", "Last Name", "Balance" );

      try // input the values from the file
      { 
         while ( true )
         {
            record = ( AccountRecordSerializable ) input.readObject();

            // display record contents
            System.out.printf( "%-10d%-12s%-12s%10.2f\n",
               record.getAccount(), record.getFirstName(),
               record.getLastName(), record.getBalance() );
         } // end while
      } // end try
      catch ( EOFException endOfFileException )
      {
         return; // end of file was reached
      } // end catch
      catch ( ClassNotFoundException classNotFoundException )
      {
         System.err.println( "Unable to create object." );
      } // end catch
      catch ( IOException ioException )
      {
         System.err.println( "Error during reading from file." );
      } // end catch
   } // end method readRecords

   // close file and terminate application
   public void closeFile()
   {
      try // close file and exit
      {
         if ( input != null )
            input.close();
         System.exit( 0 );
      } // end try
      catch ( IOException ioException )
      {
         System.err.println( "Error closing file." );
         System.exit( 1 );
      } // end catch
   } // end method closeFile
} // end class ReadSequentialFile

