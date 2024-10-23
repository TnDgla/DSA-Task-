# DSA-Task-

# For Any Doubt 💬

Reach out to *Piyush* at *6397415707* Or *Parth* at *9559805577*.
# Week 2 Task: The Beauty of Binary Search 🚀

# Ultimate Guide to Binary Search

Binary Search is one of the most fundamental and efficient searching algorithms. It operates on the principle of **divide and conquer**, allowing you to solve a problem by repeatedly halving the search space. This guide will provide you with everything you need to know about Binary Search, from the basics to advanced topics, along with templates and practice problems.

---

## Table of Contents

1. [Introduction to Binary Search](#introduction-to-binary-search)
2. [When to Use Binary Search](#when-to-use-binary-search)
3. [Recognizing a Binary Search Problem](#recognizing-a-binary-search-problem)
4. [Upper Bound and Lower Bound](#upper-bound-and-lower-bound)
5. [Binary Search on Answer](#binary-search-on-answer)
6. [Templates for Binary Search](#templates-for-binary-search)
7. [Practice Questions](#practice-questions)

---

## Introduction to Binary Search

Binary Search is a searching technique used on **sorted arrays or ranges** to find an element or a condition. The algorithm works by dividing the search space into two halves, checking the middle element, and eliminating half of the search space based on the comparison.

### Key Properties:
- **Input Requirement**: The array or range must be sorted.
- **Efficiency**: The time complexity is **O(log n)**, which makes Binary Search much faster than a linear search, especially for large datasets.

---

## When to Use Binary Search

### Indicators of Binary Search Problems:
- **Sorted Data**: When the input is sorted (increasing, decreasing, or even rotated), Binary Search is likely applicable.
- **Search for Extremes**: When you're tasked with finding a minimum, maximum, or something like "first occurrence", "last occurrence".
- **Range Queries**: Problems asking for a specific range, such as finding the lower or upper bound.
- **Optimization Problems**: When minimizing or maximizing a value is the goal, Binary Search can often be applied on the answer space.

### Common Scenarios:
- Searching for an element in a sorted array.
- Finding the first or last occurrence of an element.
- Optimizing time, distance, or other criteria where you are asked to "minimize" or "maximize" something.

---

## Recognizing a Binary Search Problem

Many problems aren't directly presented as Binary Search problems, but with practice, you'll start to recognize common patterns.

#### Ask yourself:
1. **Is the input sorted or can it be treated as sorted?**
2. **Can I break down the problem by halving the search space?**
3. **Am I trying to find a value that satisfies a certain condition (minimum/maximum, first/last occurrence)?**
4. **Is the problem asking me to minimize or maximize something?**

If any of these questions apply, Binary Search could be a potential solution.

---

## Upper Bound and Lower Bound

### **Lower Bound**:
The smallest index where the target is greater than or equal to a value. Useful when finding the first occurrence or the smallest element that satisfies a condition.

### **Upper Bound**:
The first index where an element is strictly greater than the target. Useful when finding ranges of elements or when checking the validity of a range.

### Applications of UB and LB:
- **Range Queries**: Find the number of occurrences of a specific element.
- **Positioning**: Used to find the insert position in sorted arrays.

### Example (Lower Bound in Java):
```java
public int lowerBound(int[] nums, int target) {
    int low = 0, high = nums.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}
```
### Example (Upper Bound in Java):
```java
public int upperBound(int[] nums, int target) {
    int low = 0, high = nums.length;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] <= target) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return low;
}
```

# Binary Search on Answer

Binary Search isn't always used on arrays. In some problems, we need to search for the answer itself. This is called **Binary Search on the Answer**, where the search space is a range of potential answers, and we determine whether a particular value satisfies a condition.

## Examples
- **Minimizing Maximum Distance:** Find the maximum minimum distance between elements.
- **Minimizing Time or Cost:** Solve problems like minimizing the maximum load, distance, or time.

## How to Identify
- The problem asks for the minimum/maximum of some criteria.
- You need to satisfy certain conditions by varying the possible answers.

## Example: Binary Search on Answer Template in Java

```java
public boolean canSatisfyCondition(int mid, int[] conditions) {
    // Implement the logic to check if mid satisfies the problem's conditions.
    return true; // or false depending on whether the condition is satisfied
}

public int binarySearchOnAnswer(int[] arr) {
    int low = 1, high = arr.length, answer = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (canSatisfyCondition(mid, arr)) {
            answer = mid; // Update answer if condition is met
            high = mid - 1; // Adjust for minimizing
        } else {
            low = mid + 1; // Adjust for maximizing
        }
    }
    return answer;
}
```
# Binary Search Templates

## Standard Binary Search
Use this template when searching for an element in a sorted array.

```java
public int binarySearch(int[] nums, int target) {
    int low = 0, high = nums.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid; // Element found
        } else if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1; // Element not found
}
```
# Binary Search on Answer Template

This template is useful for problems that involve minimizing or maximizing a result. It provides a structured approach to implement binary search over a defined range.

## Code Template

The following Java code demonstrates the basic structure for performing a binary search on a specified range.

```java
public int binarySearchOnRange(int low, int high, int[] arr) {
    int answer = -1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (isValid(mid, arr)) {
            answer = mid;
            high = mid - 1; // Minimizing answer
        } else {
            low = mid + 1;
        }
    }
    return answer;
}

public boolean isValid(int mid, int[] arr) {
    // Implement problem-specific condition
    return true; // Change this based on your criteria
}
```

## Explanation

- **`binarySearchOnRange(int low, int high, int[] arr)`**:
    - This method performs binary search within the range defined by `low` and `high` indices.
    - It initializes the variable `answer` to keep track of the most recent valid `mid` value that meets the conditions specified in the `isValid` method.
    - The search continues as long as `low` is less than or equal to `high`. The midpoint `mid` is calculated, and if it is valid, `answer` is updated, and the search space is narrowed to the lower half (`high = mid - 1`). If it is not valid, the search space is adjusted to the upper half (`low = mid + 1`).

- **`isValid(int mid, int[] arr)`**:
    - This method is a placeholder that needs to be customized to implement the specific conditions required by the problem at hand.
    - It should return a boolean value indicating whether the current `mid` value satisfies the necessary criteria.


## Practice Questions

### Easy Questions
1. [Binary Search](https://leetcode.com/problems/binary-search/)
2. [Search Insert Position](https://leetcode.com/problems/search-insert-position/)
3. [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/)
4. [Sqrt(x)](https://leetcode.com/problems/sqrtx/)
5. [First Bad Version](https://leetcode.com/problems/first-bad-version/)
6. [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
7. [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/)

### Medium Questions
1. [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
2. [Find Peak Element](https://leetcode.com/problems/find-peak-element/)
3. [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/)
4. [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
5. [Minimum Speed to Arrive on Time](https://leetcode.com/problems/minimum-speed-to-arrive-on-time/)
6. [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/)

### Hard Questions
1. [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
2. [Find in Mountain Array](https://leetcode.com/problems/find-in-mountain-array/)
3. [Find a Peak Element II](https://leetcode.com/problems/find-a-peak-element-ii/)

### Classical Problems
1. [Aggressive Cows (SPOJ)](https://www.spoj.com/problems/aggrcows/)
2. [Painter Partition Problem (GFG)](https://www.geeksforgeeks.org/painter-partition-problem/)



---

# Week 1 Task: Let's Master "Subarray" Related Problems 🚀

## 1. Understand the Problem Clearly:

- Carefully read the problem and break it down.
- Are you asked to find a subarray with certain properties (e.g., smallest, largest sum, divisible sum)?
- Are you asked to maximize, minimize, or check for the existence of a condition?
- Does the problem allow for negative numbers or only positive ones?

Understanding these questions is the first step towards identifying which algorithm or technique might work best for solving the problem.

---

## 2. Analyze the Subarray Nature:

Subarrays are contiguous parts of an array, and different categories of subarray-related problems exist. 
- *Key Point*: Each category has specific patterns and hints towards a particular type of solution, so recognizing the subarray nature in the problem is crucial.

---

## 3. Look for Common Patterns:

### 1) Sliding Window or Two-Pointer Technique:

- *When to Use*:
  - Finding a subarray with a fixed sum or length.
  - Finding a subarray with conditions that can be checked as you move from one end of the array to another.
  
- *Why It Works*: This technique is efficient because it processes the array in linear time, expanding and contracting the window as needed.

- *Common Problem Types*:
  - Finding the smallest subarray with a sum greater than X.
  - Longest subarray with distinct elements or fixed-length subarrays.

- *Example*:
  - If you’re asked to find the longest subarray with sum ≤ k, sliding window is often the best approach.

---

### 2) Kadane’s Algorithm (Dynamic Programming):

- *When to Use*:
  - Finding the maximum subarray sum.

- *Why It Works*:
  - This algorithm efficiently tracks the maximum subarray sum ending at each index.
  - It's optimal as it builds solutions to subproblems (maximum sums ending at earlier indices) and extends them to solve larger problems.

- *Common Problem Types*:
  - Finding the maximum subarray sum, especially when there are no constraints on subarray length or when negative values are allowed.

- *Example*:
  - Given an array, find the maximum sum of any subarray.

---

### 3) Prefix Sum & HashMap:

- *When to Use*:
  - Modulo arithmetic (e.g., sum divisible by a number).
  - Checking sums over subarrays (especially when the subarray can be of any size).

- *Why It Works*:
  - The prefix sum allows us to break down a subarray sum into differences between two prefix sums.
  - HashMaps are used for fast lookups of previously seen sums, especially useful for problems with conditions like "sum divisible by k."

- *Common Problem Types*:
  - Finding subarrays that sum to k, or removing a subarray to make a sum divisible by a given value.

- *Example*:
  - Find the smallest subarray whose sum is divisible by a number p.

---

## 4. Practice Questions

### Easy Problems:

1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
2. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)
3. [Count Elements with Maximum Frequency](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
4. [Divide Array into Arrays with Max Difference](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
5. [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
6. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
7. [Minimum Common Value](https://leetcode.com/problems/minimum-common-value/)

---

### Two-Pointer Problems:

1. [3Sum](https://leetcode.com/problems/3sum/)
2. [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
3. [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
4. [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
5. [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)

---

### Prefix Sum Problems:

1. [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
2. [Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)
3. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays)
4. [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
5. [K-radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/)

---

## 5. Let's Solve Some Problems:

### Leetcode Problems:

1. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
2. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)
4. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### OA Problem:

1. LinkedIn - SDE Intern:
   - *Question*: Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions so the final string contains no adjacent equal characters.
   
   Example:  
   Input: ['add', 'boook', 'break']  
   Output: [1, 1, 0]

---
