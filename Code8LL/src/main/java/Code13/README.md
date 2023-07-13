# Balanced Brackets Validator

## Problem Domain

This application validates strings to check if they have balanced brackets. There are three types of brackets considered:

- Round Brackets : `()`
- Square Brackets : `[]`
- Curly Brackets : `{}`

The brackets in the string are considered balanced if:

- Every opening bracket has a corresponding closing bracket.
- Opening brackets are properly nested and closed in the correct order.

The validator considers all characters in the string. Any characters that are not brackets are ignored.

## Visual

This is an example of a valid string with balanced brackets:

```
{}{Code}[Fellows](())
```

This string contains pairs of all three types of brackets, and each pair of brackets is properly nested and closed. Therefore, the string is valid.

On the other hand, this is an example of an invalid string:

```
[({}]
```

Even though this string contains pairs of all three types of brackets, the brackets are not properly nested and closed in the correct order. Therefore, the string is invalid.

## Algorithm

The application uses a stack to validate the brackets. It iterates through each character in the string and does the following:

- If the character is an opening bracket, it pushes the bracket onto the stack.
- If the character is a closing bracket, it checks the bracket at the top of the stack.
    - If the bracket at the top of the stack is the corresponding opening bracket, it pops the bracket off the stack.
    - If the bracket at the top of the stack is not the corresponding opening bracket, it stops and returns that the string is invalid.
- If the character is not a bracket, it ignores the character.

If the application iterates through all characters in the string without finding any unbalanced brackets, it checks if there are any remaining opening brackets in the stack. If the stack is empty, it returns that the string is valid. If the stack is not empty, it returns that the string is invalid.

## Input / Output

The validator function takes one argument:

- `str` (string): The string to validate.

It returns a boolean value indicating whether the brackets in the string are balanced.

Examples:

- `validateBrackets("{}")` returns `true`
- `validateBrackets("{}(){}")` returns `true`
- `validateBrackets("()[[Extra Characters]]")` returns `true`
- `validateBrackets("(){}[[]]")` returns `true`
- `validateBrackets("{}{Code}[Fellows](())")` returns `true`
- `validateBrackets("[({}]")` returns `false`
- `validateBrackets("(]")` returns `false`
- `validateBrackets("{(})")` returns `false`

## Tests

The application has a suite of unit tests that validate its functionality against a set of test cases. You can run these tests by executing the `MainTest` class in your test runner.

## How to Get the Code

You can get the code by cloning the repository from GitHub. Here's how:

1. Open your terminal.
2. Navigate to the directory where you want to clone the repository.
3. Run the following command to clone the repository:
   ```
   git clone https://github.com/CodrCam/Code-Java.git
   ```
4. Navigate into the cloned repository:
   ```
   cd Code-Java
   ```
5. Check out the branch for this project:
   ```
   git checkout code13
   ```
   Replace `code13` with the name of the branch for this project.
6. Open the project in your preferred Java IDE or text editor.

---
