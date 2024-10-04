package ch.heigvd.dai.ios.binary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import ch.heigvd.dai.ios.Readable;

/**
 * A class that reads binary files. This implementation reads the file byte per byte. It manages the
 * file input stream properly with a try-catch-finally block.
 */
public class BinaryFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (InputStream fis = new FileInputStream(filename)) {
      int b;
      while ((b = fis.read()) != -1) {
        //System.out.print(b);
      }
      //System.out.println();
      fis.close();
    } catch (IOException e) {
      System.out.println("Error reading file: " + filename);
    }
    //throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
