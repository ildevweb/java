package Capitalize;
import java.io.*;
import java.util.Scanner;


public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        File input = new File("./Capitalize/"+args[0]);


        /*try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        
        try (Scanner scanner = new Scanner(input);
            PrintWriter writer = new PrintWriter("./Capitalize/"+args[1])) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.trim().replaceAll("\\s+", " ").split(" ");
                String[] edited = new String[parts.length];

                for (int i = 0; i < parts.length; i++) {
                    String word = parts[i];
                    if (!word.isEmpty()) {
                        edited[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
                    } else {
                        edited[i] = word;
                    }
                }


                writer.print(String.join(" ", edited));
            }
        } 
        
    }
}