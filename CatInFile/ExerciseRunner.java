package CatInFile;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ExerciseRunner {
    public static void main(String[] args) throws IOException {
        String input = "input file test\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        CatInFile.cat(new String[]{"./CatInFile/output"});
        String fileContent = new String(Files.readAllBytes(Paths.get("./CatInFile/output")));
        System.out.println(fileContent.equals(input));
    }
}