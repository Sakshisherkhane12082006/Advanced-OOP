package ExperimentNo7;

import java.io.*;

public class ReadFileProgram {

    public static void main(String[] args) {

        try {
            // Give full path of file (example path)
            File file = new File("C:\\Users\\YourName\\Desktop\\sample.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
