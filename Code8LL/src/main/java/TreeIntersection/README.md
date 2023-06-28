# Tree Intersection

## Problem Domain

The Tree Intersection program is a solution for finding common values in two binary trees. It uses a Hashtable to efficiently store and lookup the values in the trees and provides a set of values that are found in both trees.

## Features

- Traverse through two binary trees and identify the common values.
- Use a Hashtable to efficiently manage and lookup the values in the tree.
- Return a set of common values in the two binary trees.

## Visual

The following diagram shows how the Tree Intersection works.

[Figma Board](https://www.figma.com/file/NJdRL4PviTDChRJe13KfH2/Untitled?type=whiteboard&node-id=0%3A1&t=L5SqISeBTiwkNWMG-1)

## Big O Notation

The time complexity for the Tree Intersection algorithm is O(n) as it needs to traverse all the nodes in both binary trees.

The space complexity is also O(n) as in the worst-case scenario it may need to store all the elements of the trees in the Hashtable and intersection set.

## Testing

Unit tests for the Tree Intersection program are included in the `TreeIntersectionTest` class. The tests use JUnit and cover different scenarios, such as trees with and without common values. You can run the tests using your preferred testing framework.

## How to Run

To use the Tree Intersection program, follow these steps:

1. Create two `BinaryTree` objects representing your binary trees.
2. Call the `TreeIntersection.intersection(tree1, tree2)` method, passing the two binary trees as arguments. The method will return a set of common values.

