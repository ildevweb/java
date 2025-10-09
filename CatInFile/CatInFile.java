package CatInFile;
import java.io.*;
import java.util.Scanner;


public class CatInFile {
    public static void cat(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);
            PrintWriter writer = new PrintWriter(args[0])) {
            while (scanner.hasNextLine()) {
                writer.println(scanner.nextLine());
            }
        }
    }
}