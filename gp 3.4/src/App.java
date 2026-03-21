/*
Jessica Willis
3/20/2026
3.4
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    private static final String FILE_NAME = "jessica.txt";
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis 3.4");
        System.out.println(writeToFile());
        System.out.println(readFromFile());
    }

    public static String writeToFile() {
        try {
            PrintWriter myWriter = new PrintWriter(FILE_NAME);
            myWriter.println("Hello Jessica");
            myWriter.println("You just wrote 2 lines of text into a file");
            myWriter.close();
            return "Successfully wrote to the file.";
        } catch (FileNotFoundException e) {
            return "An error occured"; 
        }
    }

    public static String readFromFile() {
        try {
            File myObj = new File(FILE_NAME);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            return "all lines from file printed";
        } catch (FileNotFoundException e) {
            return "an error occured.";
        }
    }
}
