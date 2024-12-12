### Problem Statement for Ceiling of a Target Element

You are given a sorted array of integers `arr` and a target integer `target`. Your task is to find the **ceiling** of the target. 

The **ceiling** of a target is the smallest element in the array that is **greater than or equal to the target**. If no such element exists, return `-1`.

#### Example:
1. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9], target = 6`  
   **Output**: `8`  
   **Explanation**: The smallest element greater than or equal to `6` is `8`.

2. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9], target = 5`  
   **Output**: `5`  
   **Explanation**: The element `5` is equal to the target, so it is the ceiling.

3. **Input**:  
   `arr = [1, 2, 4, 5, 8, 9], target = 10`  
   **Output**: `-1`  
   **Explanation**: There is no element greater than or equal to `10`.

### Constraints:
1. The array `arr` is sorted in ascending order.
2. The array `arr` contains distinct integers.
3. The target can be any integer (positive, negative, or zero).
