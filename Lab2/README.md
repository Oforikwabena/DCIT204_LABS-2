# DCIT 204 – Lab 2: Interactive Array Algorithms

## Overview
This lab implements two fundamental array algorithms in Java using the `Scanner` class for all user input.

---

## Files

| File | Description |
|------|-------------|
| `FindMax.java` | Finds the maximum value in an integer array and its index |
| `PairSum.java` | Brute-force search for a pair of elements that sum to a target value |

---

## How to Compile and Run

### Compile
```bash
javac FindMax.java
javac PairSum.java
```

### Run FindMax
```bash
java FindMax
```
**Sample interaction:**
```
Enter the number of elements in the array: 5
Enter 5 integer value(s) one at a time:
  Element [0]: 3
  Element [1]: 7
  Element [2]: 1
  Element [3]: 9
  Element [4]: 4

-------------------------------------------
                   RESULTS
-------------------------------------------
Array: [ 3, 7, 1, 9, 4 ]
Maximum Value : 9
Found at Index: 3
-------------------------------------------
```

### Run PairSum
```bash
java PairSum
```
**Sample interaction (pair found):**
```
Enter the number of elements in the array: 5
Enter 5 integer value(s) one at a time:
  Element [0]: 2
  Element [1]: 7
  Element [2]: 4
  Element [3]: 1
  Element [4]: 5

Enter the Target Sum: 9

-------------------------------------------
                   RESULTS
-------------------------------------------
Array     : [ 2, 7, 4, 1, 5 ]
Target Sum: 9
-------------------------------------------
Pair Found!
  Index [0] = 2
  Index [2] = 4
  ... wait — 2+4=6, trying Index [1]:
  Index [0] = 2
  Index [1] = 7
  Equation: 2 + 7 = 9
-------------------------------------------
```

**Sample interaction (no pair):**
```
Enter the Target Sum: 100
No pair found that sums to 100.
```

---

## Algorithm Analysis

### Task 1 — Find Maximum
- **Strategy:** Single linear pass; track running maximum and its index.
- **Time Complexity:** O(n)
- **Space Complexity:** O(1) auxiliary

### Task 2 — Pair Sum (Brute Force)
- **Strategy:** Nested loops examine every unique pair `(i, j)` where `i < j`.
- **Time Complexity:** O(n²)
- **Space Complexity:** O(1) auxiliary

---

## Author
Student Name: Kwabena  
Student ID: 22405802  
Course: DCIT 204  
Lab: 2
