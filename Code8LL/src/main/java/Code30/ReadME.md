# Hashtable

The Hashtable program provides an efficient way to store and retrieve key-value pairs. It handles collisions and supports operations like checking if a key exists and retrieving all keys in the table.

## Features

The Hashtable program provides the following functionality:

- Storing key-value pairs: This allows you to store values with their associated keys.
- Handling collisions: When two keys produce the same hash, the program handles it by searching for the next available index.
- Checking if a key exists: Before adding new keys or for other purposes, you can check if a key already exists in the table.
- Retrieving all keys: You can get a collection of all keys currently in the table.

## Implementation Details

The Hashtable program is implemented using Java. The core functionality is provided by the `Hashtable` and `Entry` classes.

### `Entry` Class

The `Entry` class represents the individual entries in the hashtable, containing a key and a value.

### `Hashtable` Class

The `Hashtable` class provides the core functionality of the hashtable. It contains several methods:

#### `public void set(String key, String value)`
This method hashes the key and sets the key-value pair in the hashtable, handling collisions as needed.

#### `public String get(String key)`
This method returns the value associated with the given key in the hashtable.

#### `public boolean has(String key)`
This method returns a boolean value indicating whether the given key exists in the hashtable.

#### `public List<String> keys()`
This method returns a collection of all keys in the hashtable.

## Testing

Unit tests for the Hashtable program are included in the `HashtableTest` class. The tests use JUnit and cover different scenarios, such as adding key-value pairs, retrieving values, checking key existence, and retrieving all keys. You can run the tests using your preferred testing framework.

## How to Run

To use the Hashtable program, follow these steps:

1. Create a `Hashtable` object.
2. Use the `set` method to add key-value pairs to the hashtable.
3. Use the `get` method to retrieve the value associated with a key.
4. Use the `has` method to check if a key exists in the hashtable.
5. Use the `keys` method to retrieve a collection of all keys in the hashtable.

## Whiteboard

[Figma Board](https://www.figma.com/file/38enk18hXiPM4CAHJFw8cS/Code30WB?type=whiteboard&node-id=0%3A1&t=nSqCMMLHFyVV2Het-1)