package code37tests;

import Code37.BusinessTrip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

public class BusinessTripTest {

    @Test
    public void testGetCost() {
        Map<String, Map<String, Integer>> graph = createGraph();
        BusinessTrip businessTrip = new BusinessTrip(graph);

        Assertions.assertEquals(150, businessTrip.getCost("Pandora", "Arendelle"));
        Assertions.assertEquals(99, businessTrip.getCost("Arendelle", "Metroville"));
        Assertions.assertEquals(82, businessTrip.getCost("Pandora", "Metroville"));
        Assertions.assertEquals(37, businessTrip.getCost("Metroville", "Narnia"));
        Assertions.assertEquals(250, businessTrip.getCost("Narnia", "Naboo"));
        Assertions.assertEquals(26, businessTrip.getCost("Metroville", "Naboo"));
        Assertions.assertEquals(73, businessTrip.getCost("Naboo", "Monstropolis"));
        Assertions.assertEquals(105, businessTrip.getCost("Metroville", "Monstropolis"));
        Assertions.assertEquals(42, businessTrip.getCost("Arendelle", "Monstropolis"));
    }

    @Test
    public void testGetCost_NotPossible() {
        Map<String, Map<String, Integer>> graph = createGraph();
        BusinessTrip businessTrip = new BusinessTrip(graph);

        Integer cost = businessTrip.getCost("Pandora", "Narnia");
        Assertions.assertNull(cost);
    }

    private Map<String, Map<String, Integer>> createGraph() {
        Map<String, Map<String, Integer>> graph = new HashMap<>();

        graph.put("Pandora", createCityMap("Arendelle", 150, "Metroville", 82));
        graph.put("Arendelle", createCityMap("Metroville", 99, "Monstropolis", 42));
        graph.put("Metroville", createCityMap("Narnia", 37, "Naboo", 26, "Monstropolis", 105));
        graph.put("Narnia", createCityMap("Naboo", 250));
        graph.put("Naboo", createCityMap("Monstropolis", 73));

        return graph;
    }

    private Map<String, Integer> createCityMap(Object... citiesAndCosts) {
        Map<String, Integer> cityMap = new HashMap<>();

        for (int i = 0; i < citiesAndCosts.length; i += 2) {
            String city = (String) citiesAndCosts[i];
            int cost = (int) citiesAndCosts[i + 1];
            cityMap.put(city, cost);
        }

        return cityMap;
    }
}
