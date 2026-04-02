/**
 * Jessica Willis
 * 3/27/2026
 * gp 4.3
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
    public static final String FILE_NAME = "Jessica.dat";
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica willis gp 4.3");
        System.out.println(writeToFile());
        System.out.println(readFromFile());
    }

    public static String writeToFile() throws IOException {
        try {
            FileOutputStream outStream = new FileOutputStream(FILE_NAME);
            DataOutputStream outputFile = new DataOutputStream(outStream);
            System.out.println("Starting to write to file");
            outputFile.writeInt(5);
            outputFile.writeDouble(9.95);
            System.out.println("Finished writing to file\n");
            outputFile.close();
            return "Write completed successfully";
        } catch (IOException e) {
            return "An error occured";
        }
    }

    public static String readFromFile() throws IOException {
        try {
            FileInputStream inStream = new FileInputStream(FILE_NAME);
            DataInputStream inputFile = new DataInputStream(inStream);
            int fileInt = 0;
            double fileDbl = 0.0;
            System.out.println("Starting to read file");
            fileInt = inputFile.readInt();
            System.out.print(fileInt + " ");
            fileDbl = inputFile.readDouble();
            System.out.println(fileDbl);
            inputFile.close();
            System.out.println("Finished reading from file");
            return "reading completed Successfully";
        } catch (IOException e) {
            return "An error occurred";
        }
    } 
}
