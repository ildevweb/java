package SortList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        List<Integer> arr = new ArrayList<>(list);

        Collections.sort(arr);

        return arr;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> arr = new ArrayList<>(list);

        Collections.sort(arr, Collections.reverseOrder());

        return arr;
    }
}