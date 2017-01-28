import java.io.*;
import java.util.StringTokenizer;

public class testFileReader {
    public static void main(String[] args) throws Exception {
        try {
            String workingDir = System.getProperty("user.dir");
            System.out.println(workingDir);
            FileReader file = new FileReader(workingDir + "/testfile.txt");
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