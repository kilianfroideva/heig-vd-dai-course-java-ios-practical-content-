package ch.heigvd.dai.ios.text;
import java.io.*;
import java.nio.charset.StandardCharsets;
import ch.heigvd.dai.ios.Readable;
import java.io.IOException;

/**
 * A class that reads text files. This implementation reads the file byte per byte. It manages the
 * file reader properly with a try-catch-finally block.
 */
public class TextFileReader implements Readable {

  @Override
  public void read(String filename) {
    try (    Reader reader = new FileReader(filename, StandardCharsets.UTF_8);){
      int c;
      while ((c = reader.read()) != -1) {
        //System.out.print((char) c);
      }
      //System.out.println();
      reader.close();
    } catch (IOException e) {
      System.out.println("Error reading file: " + filename);
    }
    //throw new UnsupportedOperationException("Please remove this exception and implement this method.");
  }
}
