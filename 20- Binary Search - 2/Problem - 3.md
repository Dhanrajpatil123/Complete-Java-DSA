**Problem Statement:**  

You are given an infinite sorted array of integers. Since the array is infinite, you do not have direct access to its length. Your task is to find the index of a given target value in the array.  

If the target exists in the array, return its index. If the target does not exist, print a message indicating that the target was not found.  

For simplicity, in this problem, assume the array provided has limited elements, but the solution should simulate how you would approach the problem for an infinite array.  

### Example:  
1. **Input:**  
   `arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94}`  
   `target = 25`  
   **Output:**  
   `Index = 6`  

2. **Input:**  
   `arr = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94}`  
   `target = 10`  
   **Output:**  
   `Something went wrong`  

### Constraints:  
1. The array is sorted in increasing order.  
2. Assume the array is infinite, so you cannot directly retrieve its length.  
3. The target value is an integer.  
4. If the target is not found, print an appropriate message.  

**Objective:** Design an efficient approach to handle the infinite nature of the array and find the target value, if present.  
