/*
 *In Terminal/Commandline, enter these two commands:
 *javac testFileReader.java
 *java testFileReader
 */

import java.io.*;
import java.util.StringTokenizer;

public class testFileReader {
  public static void main(String[] args) throws Exception {
    int numOfTokens = 3;
    try {
      FileReader file = new FileReader("testfile.txt");
      BufferedReader reader = new BufferedReader(file);
      String line = reader.readLine();
      while (line != null) {
        StringTokenizer tokens = new StringTokenizer(line);
        if (tokens.countTokens() == numOfTokens) {
          for (int i = 1; i <= numOfTokens; i++) {
            System.out.println(tokens.nextToken());
          }
        }
        line = reader.readLine();
      }
    } catch (Exception e) {
      System.err.println("Exception");
      // do something
    }
  }
}
