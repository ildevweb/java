package KeepTheChange;

import java.util.*;
import java.util.stream.Collectors;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> result = new ArrayList<>();

        List<Integer> sorted = coins.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int am = amount;
    
        for (Integer coin : sorted) {
            while (am > coin) {
                result.add(coin);
                am -= coin;
            }

            if (am % coin == 0) {
                result.add(coin);
                break;
            }
        }

        return result;
    }
}