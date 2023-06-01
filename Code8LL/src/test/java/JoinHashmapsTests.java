import Code32.JoinHashmaps;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class JoinHashmapsTest {

    @Test
    void testJoin() {
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

        List<List<String>> expectedLeftJoin = Arrays.asList(
                Arrays.asList("diligent", "employed", "idle"),
                Arrays.asList("fond", "enamored", "averse"),
                Arrays.asList("guide", "usher", "follow"),
                Arrays.asList("outfit", "garb", null),
                Arrays.asList("wrath", "anger", "delight")
        );

        List<List<String>> expectedRightJoin = Arrays.asList(
                Arrays.asList("diligent", "employed", "idle"),
                Arrays.asList("fond", "enamored", "averse"),
                Arrays.asList("guide", "usher", "follow"),
                Arrays.asList("flow", null, "jam"),
                Arrays.asList("wrath", "anger", "delight")
        );

        assertEquals(expectedLeftJoin, JoinHashmaps.join(synonyms, antonyms, "left"));
        assertEquals(expectedRightJoin, JoinHashmaps.join(synonyms, antonyms, "right"));
    }
}
