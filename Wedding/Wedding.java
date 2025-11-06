package Wedding;

import java.util.*;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> result = new HashMap<>();
        List<String> f = new ArrayList<>(first);
        List<String> s = new ArrayList<>(second);

        if (first.size() == second.size()) {
            for (Integer i = 0; i < first.size(); i++) {
                result.put(f.get(i), s.get(i));
            }
        }
        
        return result;
    }
}