**Problem Statement:**  

You are given an infinite sorted binary array `arr`, which contains only `0`s and `1`s. The array is sorted in non-decreasing order, meaning all `0`s appear before `1`s.  

Your task is to find the index of the first occurrence of `1` in this array. Since the array is infinite, you cannot use its length directly.  

If the array starts with `1`, return the index `0`. If the array contains no `1`, return `-1`.  

### Example 1:  
**Input:**  
`arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}`  
**Output:**  
`5`  
**Explanation:**  
The first occurrence of `1` is at index `5`.  

### Example 2:  
**Input:**  
`arr = {1, 1, 1, 1, 1}`  
**Output:**  
`0`  
**Explanation:**  
The array starts with `1`, so the first occurrence is at index `0`.  

### Example 3:  
**Input:**  
`arr = {0, 0, 0, 0, 0, 0, 0}`  
**Output:**  
`-1`  
**Explanation:**  
The array contains no `1`, so the output is `-1`.  

---

### Constraints:
1. The array is infinite, meaning its length is unknown.
2. The array contains only binary elements: `0` and `1`.
3. The array is sorted in non-decreasing order.
