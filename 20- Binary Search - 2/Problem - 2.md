# Interview Question


**Problem Statement:**  

You are given an infinite sorted array `arr` of integers. The array is sorted in non-decreasing order and is conceptually infinite, meaning you do not know its size in advance.  

Your task is to find the starting and ending indices of a given target value in the array. If the target does not exist in the array, return `-1, -1`.  

**Example:**  

Input:  
`arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94}`  
`target = 25`  

Output:  
`4, 6`  

Explanation:  
The target `25` is found starting from index `4` to index `6`.  

Input:  
`arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94}`  
`target = 50`  

Output:  
`-1, -1`  

---

**Constraints:**  
1. You do not know the size of the array beforehand.  
2. The array is sorted in non-decreasing order.  
3. The array contains only integers.  
4. If the target value appears multiple times, return the range of indices where it occurs.  
5. The output should be in the format: `start_index, end_index`.  
