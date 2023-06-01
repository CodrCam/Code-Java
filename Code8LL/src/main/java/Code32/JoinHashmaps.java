package Code32;

import java.util.*;

public class JoinHashmaps {
    public static List<List<String>> join(HashMap<String, String> map1, HashMap<String, String> map2, String joinType) {
        // Initialize the result list
        List<List<String>> result = new ArrayList<>();

        // Choose the hashmap to iterate and the one to search based on joinType
        HashMap<String, String> mainMap = joinType.equals("left") ? map1 : map2;
        HashMap<String, String> secondaryMap = joinType.equals("left") ? map2 : map1;

        // Perform the join
        for (Map.Entry<String, String> entry : mainMap.entrySet()) {
            // Initialize a new row
            List<String> row = new ArrayList<>();
            row.add(entry.getKey());
            row.add(entry.getValue());

            // Add the value from the second hashmap if it exists
            if (secondaryMap.containsKey(entry.getKey())) {
                row.add(secondaryMap.get(entry.getKey()));
            } else {
                row.add(null);
            }

            // Add the row to the result
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        HashMap<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");
        synonyms.put("outfit", "garb");
        synonyms.put("wrath", "anger");

        HashMap<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");
        antonyms.put("wrath", "delight");

        System.out.println(join(synonyms, antonyms, "left"));  // Perform a left join
        System.out.println(join(synonyms, antonyms, "right"));  // Perform a right join
    }
}


