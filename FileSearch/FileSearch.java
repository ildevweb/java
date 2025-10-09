package FileSearch;
import java.io.File;


public class FileSearch {

    public static String searchFile(String fileName) {
        File root = new File("documents");  // Start from the documents folder
        return searchRecursive(root, fileName);
    }

    private static String searchRecursive(File dir, String targetName) {
        File[] files = dir.listFiles();

        if (files == null) return null; // Empty or not a directory

        for (File file : files) {
            if (file.isDirectory()) {
                String result = searchRecursive(file, targetName);
                if (result != null) {
                    return dir.getName() + "/" + result;
                }
            } else if (file.getName().equals(targetName)) {
                return file.getName(); // Found the file
            }
        }
        return null; // Not found
    }
}
