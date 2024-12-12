### Problem Statement

**Title**: Find the Floor of a Target Element in a Sorted Array  

**Description**:  
You are given a sorted array of integers and a target element. Your task is to find the **floor** of the target element in the array. The floor of a target is the largest element in the array that is less than or equal to the target. If the target is smaller than the smallest element in the array, return -1.  

**Input**:  
- A sorted array `arr` of integers in ascending order (e.g., `[1, 2, 4, 5, 8, 9]`).  
- An integer `target` representing the element to find the floor for.  

**Output**:  
- An integer representing the floor of the target element in the array.  

**Constraints**:  
1. The array is sorted in ascending order.  
2. The array contains unique elements.  
3. The size of the array is between 1 and 10^6.  

**Example**:  

1. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9]`  
   `target = 6`  
   **Output**:  
   `5`  

2. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9]`  
   `target = 5`  
   **Output**:  
   `5`  

3. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9]`  
   `target = 0`  
   **Output**:  
   `-1`  

4. **Input**:  
   `arr = [3, 6, 9]`  
   `target = 7`  
   **Output**:  
   `6`  

 
