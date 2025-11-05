package MapInventory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Collections;


public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        if (inventory.containsKey(productId)) {
            return inventory.get(productId);
        }
        
        return -1;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == price) {
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        return result;
    }
}