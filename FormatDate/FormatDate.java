package FormatDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", Locale.FRENCH);
        String month = dateTime.format(formatter);
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        int second = dateTime.getSecond();


        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", day, month, year, hour, minute, second);
    }

    public static String formatSimple(LocalDate date) {
        int year = date.getYear();
        int day = date.getDayOfMonth();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", Locale.ITALIAN);
        String month = date.format(formatter);

        return String.format("%s %d %d", month, day, year%100);
    }

    public static String formatIso(LocalTime time) {
        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();
        int nano = time.getNano();

        return String.format("%d:%d:%d.00%d", hours, minutes, seconds, nano);
    }

}