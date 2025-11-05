package StreamMap;

import java.util.stream.*;
import java.util.*;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.mapToInt(String::length).sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(String::toUpperCase).collect(Collectors.toList());
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(d -> d > 42).mapToInt(Double::intValue).distinct().boxed().collect(Collectors.toSet());
    }
}