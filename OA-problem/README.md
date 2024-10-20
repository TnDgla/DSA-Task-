# LinkedIn SDE Intern Question: Adjacent Characters

## Problem Statement

Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions required so that the final string contains no adjacent equal characters.

## Example

**Input:** 
```
['add', 'boook', 'break']
```

**Output:** 
```
[1, 1, 0]
```

## Explanation

1. We define a helper function `count_substitutions` that counts the number of adjacent equal characters in a word.
2. For each word, we iterate through its characters and increment the count when we find adjacent equal characters.
3. We apply this function to each word in the input list using a list comprehension.
4. The result is a list of minimum substitutions required for each word.

## Time Complexity

The time complexity of this solution is O(n * m), where n is the number of words and m is the average length of the words.

## Space Complexity

The space complexity is O(n) for the output list, where n is the number of input words.