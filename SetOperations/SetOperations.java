package SetOperations;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (Integer elem : set1) {
            result.add(elem);
        }

        for (Integer elem : set2) {
            result.add(elem);
        }

        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>();

        for (Integer elem : set1) {
            if (set2.contains(elem)) {
                result.add(elem);
            }
        }

        return result;
    }
}