package ParseDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        String[] parts = stringDate.split(",\\s*");

        int hours = Integer.parseInt(parts[0].substring(0, 2));
        if (parts[0].contains("soir")) {
            hours += 12;
        }

        String[] second = parts[1].split(" et ");

        int minutes = Integer.parseInt(second[0].substring(0, 2));
        int secondes = Integer.parseInt(second[1].substring(0, 2));

        return LocalTime.of(hours, minutes, secondes);
    }

}