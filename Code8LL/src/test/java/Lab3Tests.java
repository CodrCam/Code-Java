import Lab3.Main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Lab3Tests {

    @Test
    public void testAnalyzeWeatherData() {
        int[][] data = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expectedOutput = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n";
        assertEquals(expectedOutput, Main.analyzeWeatherData(data));
    }

    @Test
    public void testTally() {
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
        String expectedWinner = "Bush";
        assertEquals(expectedWinner, Main.tally(votes));
    }

    @Test
    public void testCheckJavaScriptSyntax_noErrors() throws IOException {
        Path path = Files.createTempFile("noErrors", ".js");
        Files.write(path, Arrays.asList("let a = 1;", "if (a == 1) {", "console.log(a);", "}"));
        assertEquals("", Main.checkJavaScriptSyntax(path));
    }

    @Test
    public void testCheckJavaScriptSyntax_oneError() throws IOException {
        Path path = Files.createTempFile("oneError", ".js");
        Files.write(path, Arrays.asList("let a = 1", "if (a == 1) {", "console.log(a);", "}"));
        assertEquals("Line 1: Missing semicolon.\n", Main.checkJavaScriptSyntax(path));
    }

    @Test
    public void testCheckJavaScriptSyntax_fewErrors() throws IOException {
        Path path = Files.createTempFile("fewErrors", ".js");
        Files.write(path, Arrays.asList("let a = 1", "console.log(a)", "console.log(a);", "let b = 2;"));
        String expectedErrors = "Line 1: Missing semicolon.\nLine 2: Missing semicolon.\n";
        assertEquals(expectedErrors, Main.checkJavaScriptSyntax(path));
    }

    @Test
    public void testCheckJavaScriptSyntax_manyErrors() throws IOException {
        Path path = Files.createTempFile("manyErrors", ".js");
        Files.write(path, Arrays.asList("let a = 1", "console.log(a)", "let b = 2", "console.log(b)", "let c = 3"));
        String expectedErrors = "Line 1: Missing semicolon.\nLine 2: Missing semicolon.\nLine 3: Missing semicolon.\nLine 4: Missing semicolon.\nLine 5: Missing semicolon.\n";
        assertEquals(expectedErrors, Main.checkJavaScriptSyntax(path));
    }

    @Test
    public void testCheckJavaScriptSyntax_emptyFile() throws IOException {
        Path path = Files.createTempFile("emptyFile", ".js");
        assertEquals("", Main.checkJavaScriptSyntax(path));
    }
}
