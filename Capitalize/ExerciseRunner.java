package Capitalize;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        Capitalize.capitalize(new String[]{"input", "output"});
        String expectedResult = new String(Files.readAllBytes(Paths.get("./Capitalize/result")));
        String userOutput = new String(Files.readAllBytes(Paths.get("./Capitalize/output")));
        System.out.println(expectedResult.equals(userOutput));
    }
}