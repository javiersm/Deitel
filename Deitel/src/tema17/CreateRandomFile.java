package tema17;

// Fig. 14.24: CreateRandomFile.java
// Creates random-access file by writing 100 empty records to disk.
import java.io.IOException;
import java.io.RandomAccessFile;

import tema17.RandomAccessAccountRecord;

public class CreateRandomFile
{    
   private static final int NUMBER_RECORDS = 100;

   // enable user to select file to open
   public void createFile()
   {
      RandomAccessFile file = null;

      try // open file for reading and writing
      {           
         file = new RandomAccessFile( "clients.dat", "rw" );

         RandomAccessAccountRecord blankRecord = 
            new RandomAccessAccountRecord();

         // write 100 blank records
         for ( int count = 0; count < NUMBER_RECORDS; count++ )
            blankRecord.write( file );

         // display message that file was created
         System.out.println( "Created file clients.dat." );

         System.exit( 0 ); // terminate program
      } // end try
      catch ( IOException ioException )
      {
         System.err.println( "Error processing file." );
         System.exit( 1 );
      } // end catch
      finally
      {
         try
         {
            if ( file != null )
               file.close(); // close file
         } // end try
         catch ( IOException ioException )
         {
            System.err.println( "Error closing file." );
            System.exit( 1 );
         } // end catch
      } // end finally
   } // end method createFile
} // end class CreateRandomFile
