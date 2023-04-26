# LinkedList and kthFromEnd

A Java implementation of a singly linked list with basic operations (append, insertBefore, insertAfter) and a method to find the value of the kth node from the end.

## Problem Description

Given a singly linked list, implement a method `kthFromEnd` that returns the value of the node that is k places from the tail of the linked list.

## Classes

### LinkedList

The main class that represents the singly linked list, with the following methods:

- `append(int newValue)`
- `insertBefore(int value, int newValue)`
- `insertAfter(int value, int newValue)`
- `kthFromEnd(int k)`
- `getHead()`

### ListNode

A simple class representing the node of a singly linked list, with the following properties:

- `value`
- `next`

## Example

```java
LinkedList linkedList = new LinkedList();
linkedList.append(1);
linkedList.append(3);
linkedList.append(8);
linkedList.append(2);

int result = linkedList.kthFromEnd(2); // result = 3
