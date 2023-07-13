# Java Code Analysis

## Problem Domain

This repository contains code for a set of problems involving weather data analysis, election tallying, and JavaScript file syntax checking:

1. **Weather Data Analysis:** Given a 2D array of daily temperatures in a month for Seattle, the task is to find the minimum and maximum temperatures, and then list all the temperatures in the range that were not recorded.

2. **Election Tallying:** A function `tally` takes in a list of votes (strings) and returns the entity with the most votes.

3. **JavaScript File Syntax Checking:** A function `checkJavaScriptSyntax` reads a JavaScript file and generates an error message for any line that doesn’t end with a semi-colon (with some exceptions).

## Algorithm

1. **Weather Data Analysis:**
    - Traverse the 2D array and track the minimum and maximum temperature.
    - Store each temperature in a HashSet to keep track of unique temperatures.
    - Iterate from the minimum to maximum temperature and add any temperature not in the HashSet to a result string.

2. **Election Tallying:**
    - Iterate through the list of votes and keep count of each entity's votes using a HashMap.
    - Iterate through the HashMap to find the entity with the most votes.

3. **JavaScript File Syntax Checking:**
    - Read the file line by line.
    - If the line doesn't end with a semicolon, an opening or closing brace, or doesn't contain `if` or `else`, generate an error message and add it to the result string.

## Input/Output

1. **Weather Data Analysis:**
    - Input: 2D array of integers (temperatures)
    - Output: String

2. **Election Tallying:**
    - Input: List of Strings (votes)
    - Output: String

3. **JavaScript File Syntax Checking:**
    - Input: Path of JavaScript file
    - Output: String

## Tests

Unit tests are available for each method in the [Code13Tests.java](src/test/java/Code13Tests.java) file. The tests use JUnit and include scenarios such as no errors, one error, few errors, many errors, and an empty file for JavaScript syntax checking. There are also tests for weather data analysis and vote tallying based on given example scenarios.

## Getting the Code

1. Clone the repository from [https://github.com/CodrCam/Code-Java](https://github.com/CodrCam/Code-Java).

2. You can also see the code changes in this pull request: [https://github.com/CodrCam/Code-Java/pull/10](https://github.com/CodrCam/Code-Java/pull/10).

3. Run the Main.java file to see the results for the predefined inputs.

4. Run the Code13Tests.java file to execute the unit tests.

You need to have Java and JUnit installed in your local environment to run the code and tests.