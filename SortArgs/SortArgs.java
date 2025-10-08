package SortArgs;
import java.util.Arrays;



public class SortArgs {
    public static void sort(String[] args) {
        String[] arr = args;

        Arrays.sort(arr, (a,b) -> Integer.parseInt(a) - Integer.parseInt(b));

        System.out.println(String.join(" ", arr));
    }
}