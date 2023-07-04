import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Whiteboard3.Buildings;

import java.util.Arrays;
import java.util.List;

class BuildingsTest {

    @Test
    void BuildingsWithViewsTest() {
        Buildings solution = new Buildings();

        // Test Case 1
        int[] buildings1 = {3, 1, 5, 2, 1, 4, 1, 2};
        List<Integer> expected1 = Arrays.asList(5, 4, 2);
        assertEquals(expected1, solution.BuildingsWithViews(buildings1));

        // Test Case 2
        int[] buildings2 = {1, 2, 3, 4, 5};
        List<Integer> expected2 = Arrays.asList(5);
        assertEquals(expected2, solution.BuildingsWithViews(buildings2));

        // Test Case 3
        int[] buildings3 = {5, 4, 3, 2, 1};
        List<Integer> expected3 = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expected3, solution.BuildingsWithViews(buildings3));

        // Test Case 4
        int[] buildings4 = {1, 1, 1, 1, 1};
        List<Integer> expected4 = Arrays.asList(1);
        assertEquals(expected4, solution.BuildingsWithViews(buildings4));

        // Test Case 5
        int[] buildings5 = {2, 5, 1, 2, 3, 4};
        List<Integer> expected5 = Arrays.asList(5, 4);
        assertEquals(expected5, solution.BuildingsWithViews(buildings5));
    }
}
