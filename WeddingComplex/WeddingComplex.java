package WeddingComplex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> engagements = new HashMap<>();
        Map<String, List<String>> firstPrefs = new HashMap<>();
        for (var entry : first.entrySet()) {
            firstPrefs.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        Queue<String> freeFirst = new LinkedList<>(first.keySet());

        while (!freeFirst.isEmpty()) {
            String proposer = freeFirst.poll();
            List<String> prefs = firstPrefs.get(proposer);
            if (prefs.isEmpty()) continue;

            String topChoice = prefs.remove(0);

            if (!engagements.containsKey(topChoice)) {
                engagements.put(topChoice, proposer);
            } else {
                String currentPartner = engagements.get(topChoice);
                List<String> receiverPrefs = second.get(topChoice);

                if (receiverPrefs.indexOf(proposer) < receiverPrefs.indexOf(currentPartner)) {
                    engagements.put(topChoice, proposer);
                    freeFirst.add(currentPartner);
                } else {
                    freeFirst.add(proposer);
                }
            }
        }

        Map<String, String> result = new HashMap<>();
        for (var e : engagements.entrySet()) {
            result.put(e.getValue(), e.getKey());
        }
        return result;
    }
}