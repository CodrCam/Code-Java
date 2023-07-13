package Lab3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(analyzeWeatherData(weeklyMonthTemperatures));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

        Path path = Paths.get("gates.js");
        System.out.println(checkJavaScriptSyntax(path));
    }

    public static String analyzeWeatherData(int[][] data) {
        HashSet<Integer> temperatures = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] week : data) {
            for (int temp : week) {
                temperatures.add(temp);
                min = Math.min(min, temp);
                max = Math.max(max, temp);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("High: ").append(max).append("\n");
        result.append("Low: ").append(min).append("\n");

        for (int i = min; i <= max; i++) {
            if (!temperatures.contains(i)) {
                result.append("Never saw temperature: ").append(i).append("\n");
            }
        }

        return result.toString();
    }

    public static String tally(List<String> votes) {
        Map<String, Integer> voteCounts = new HashMap<>();
        for (String vote : votes) {
            voteCounts.put(vote, voteCounts.getOrDefault(vote, 0) + 1);
        }

        String winner = Collections.max(voteCounts.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        return winner;
    }

    public static String checkJavaScriptSyntax(Path path) {
        StringBuilder errors = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.trim().isEmpty() ||
                        line.trim().endsWith("{") ||
                        line.trim().endsWith("}") ||
                        line.trim().contains("if") ||
                        line.trim().contains("else")) {
                    continue;
                }

                if (!line.trim().endsWith(";")) {
                    errors.append("Line ").append(lineNumber).append(": Missing semicolon.\n");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return errors.toString();
    }
}

