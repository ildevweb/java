package RegexReplace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)((?=\\s)|$)", "");
    }
    


    public static String obfuscateEmail(String s) {
        if (s == null || !s.contains("@")) return s;

        String[] parts = s.split("@");
        if (parts.length != 2) return s;

        String username = parts[0];
        String domain = parts[1];

        Pattern p = Pattern.compile("(.*[._-])(.*)$");
        Matcher m = p.matcher(username);
        if (m.find()) {
            String hidden = m.group(2);
            username = m.group(1) + "*".repeat(hidden.length());
        } else {
            p = Pattern.compile("^(.{3})(.*)$");
            m = p.matcher(username);
            if (m.find()) {
                String rest = m.group(2);
                username = m.group(1) + "*".repeat(rest.length());
            }
        }

        /*if (username.matches(".*[._-].*")) {
            username = username.replaceFirst("([._-])(.*)$", "$1***");
        } else {
            username = username.replaceFirst("^(.{3})(.{1,3})", "$1***");
        }*/


        String[] d = domain.split("\\.");

        if (d.length == 3) {
            d[0] = d[0].replaceAll(".", "*");
            d[2] = d[2].replaceAll(".", "*");
        } else if (d.length == 2) {
            String top = d[1];
            d[0] = d[0].replaceAll(".", "*");
            if (!top.equalsIgnoreCase("com") && !top.equalsIgnoreCase("org") && !top.equalsIgnoreCase("net")) {
                d[1] = top.replaceAll(".", "*");
            }
        }

        domain = String.join(".", d);
        return username + "@" + domain;
    }




}