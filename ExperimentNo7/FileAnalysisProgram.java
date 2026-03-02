package ExperimentNo7;

import java.io.*;

public class FileAnalysisProgram {

    public static void main(String[] args) {

        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("ExperimentNo7/sample.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                // Count words
                String wordArray[] = line.split("\\s+");
                words += wordArray.length;

                // Count vowels & 'a'
                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' 
                        || ch == 'o' || ch == 'u') {
                        vowels++;
                    }

                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Number of 'a': " + countA);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}