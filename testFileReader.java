/*
 *In Terminal/Commandline, enter these two commands:
 *javac testFileReader.java
 *java testFileReader
 */

import java.io.*;
import java.util.StringTokenizer;

public class testFileReader {
    public static void main(String[] args) throws Exception {
        try {
            FileReader file = new FileReader("testfile.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while (line != null) {
                StringTokenizer tokens = new StringTokenizer(line);
                if (tokens.countTokens() == 3) {
                    System.out.println(tokens.nextToken());
                    System.out.println(tokens.nextToken());
                    System.out.println(tokens.nextToken());
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.err.println("Exception");
            // do something
        }
    }
}