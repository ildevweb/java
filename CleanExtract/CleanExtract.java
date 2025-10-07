package CleanExtract;

import java.util.ArrayList;
import java.util.List;


public class CleanExtract {
    public static String extract(String s) {
        String[] parts = s.split("\\|");
        List<String> result = new ArrayList<>();

        for (String part : parts) {
            part = part.trim();
            if (!part.contains(".") && !part.isEmpty()) {
                result.add(part);
            } else {
                int firstDot = part.indexOf(".");
                int lastDot = part.lastIndexOf(".");

                if (firstDot != -1 && lastDot != -1 && firstDot < lastDot) {
                    String text = part.substring(firstDot+1, lastDot).trim();

                    if (!text.isEmpty()) {
                        result.add(text);
                    }
                } else {
                    String text = part.substring(firstDot+1).trim();

                    if (!text.isEmpty()) {
                        result.add(text);
                    }
                }
            }
        }
        return String.join(" ", result);
    }
}
