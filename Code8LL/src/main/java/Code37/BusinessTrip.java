package Code37;

import java.util.HashMap;
import java.util.Map;

public class BusinessTrip {
    private Map<String, Map<String, Integer>> graph;

    public BusinessTrip(Map<String, Map<String, Integer>> graph) {
        this.graph = graph;
    }

    public Integer getCost(String source, String destination) {
        if (!graph.containsKey(source) || !graph.get(source).containsKey(destination)) {
            return null; // Direct flight doesn't exist
        }

        return graph.get(source).get(destination);
    }
}
