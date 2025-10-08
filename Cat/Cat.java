package Cat;

import java.io.*;
import java.util.Scanner;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        File myObj = new File("./Cat/"+args[0]);


        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
