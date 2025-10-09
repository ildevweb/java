package FileSearch;
import java.io.File;


public class FileSearch {

    public static String searchFile(String fileName) {
        File root = new File("./FileSearch/documents");
        return searchRecursive(root, fileName, "documents");
    }

    private static String searchRecursive(File dir, String targetName, String pathSoFar) {
        File[] files = dir.listFiles();

        if (files == null) return null;

        for (File file : files) {
            String currentPath = pathSoFar + "/" + file.getName();

            if (file.isDirectory()) {
                String result = searchRecursive(file, targetName, currentPath);
                if (result != null) {
                    return result;
                }
            } else if (file.getName().equals(targetName)) {
                return currentPath;
            }
        }
        return null;
    }
}
