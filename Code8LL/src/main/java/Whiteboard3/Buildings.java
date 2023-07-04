package Whiteboard3;

import java.util.*;

public class Buildings {
    public List<Integer> BuildingsWithViews(int[] buildings) {
        // Create an empty list for somewhere to put the building with a view
        List<Integer> beachViewList = new ArrayList<>();

        // Iterate the array from left to right with an outer loop
        for (int i = 0; i < buildings.length; i++) {
            // Set and use a boolean to compare height of buildings to the right
            boolean isTaller = true;

            // Iterate from current i over the array with an inner loop
            for (int j = i + 1; j < buildings.length; j++) {
                if (buildings[i] <= buildings[j]) {
                    // if any building is taller it will break from the loop
                    isTaller = false;
                    break;
                }
            }

            // if isTaller then add to the list
            if (isTaller) {
                beachViewList.add(buildings[i]);
            }
        }

        //return view list
        return beachViewList;
    }
}
