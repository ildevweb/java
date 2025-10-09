package FileManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try {
            File file = new File("./FileManager/"+fileName);

            try (PrintWriter writer = new PrintWriter(file)) {
                writer.print(content);
            } 

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public static String getContentFile(String fileName) throws IOException {
        String result = "";

        File file = new File("./FileManager/" + fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                result += line;
            }
        }
        return result;
    }


    public static void deleteFile(String fileName) {
        File file = new File("./FileManager/"+fileName);

        file.delete();
    }
}