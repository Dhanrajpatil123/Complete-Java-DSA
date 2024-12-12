### Problem Statement : Google

### **Problem Statement**  

**Title:** Count the Number of Occurrences of a Target Element in a Sorted Array  

**Objective:**  
Given a **sorted array of integers** and a target element, determine the **number of times the target element appears in the array** using an optimized approach. Your solution should handle large arrays efficiently and work within logarithmic or near-logarithmic time complexity constraints.  

---

### **Input Description:**  
1. A sorted array of integers `arr` of size `n` (1 ≤ `n` ≤ 10^6).  
   - The array is sorted in **non-decreasing order**.  
   - The array may contain duplicate values.  
2. An integer `target` (−10^9 ≤ `target` ≤ 10^9) representing the element whose occurrences need to be counted.  

---

### **Output Description:**  
- Return a single integer representing the **number of occurrences** of the target element in the array.  
- If the target is not present in the array, return `0`.  

---

### **Examples:**  

#### **Example 1:**  
**Input:**  
```
arr = [1, 2, 2, 2, 3, 4, 5]  
target = 2
```  
**Output:**  
```
3
```  
**Explanation:**  
The target `2` appears three times in the array.  

---

#### **Example 2:**  
**Input:**  
```
arr = [1, 1, 1, 1, 1]  
target = 1
```  
**Output:**  
```
5
```  
**Explanation:**  
The target `1` appears five times in the array.  

---

#### **Example 3:**  
**Input:**  
```
arr = [1, 3, 5, 7]  
target = 2
```  
**Output:**  
```
0
```  
**Explanation:**  
The target `2` does not exist in the array.  

---

#### **Example 4:**  
**Input:**  
```
arr = [-5, -3, -3, 0, 0, 0, 5, 9, 9]  
target = 0
```  
**Output:**  
```
3
```  
**Explanation:**  
The target `0` appears three times in the array.  

---

### **Constraints:**  
1. **Array Size:** 1 ≤ `n` ≤ 10^6.  
2. **Element Range:** −10^9 ≤ `arr[i]` ≤ 10^9.  
3. **Target Value:** −10^9 ≤ `target` ≤ 10^9.  
4. **Time Complexity:** The solution must run in **O(log n)** or better.  

---

test_cases:
  - name: "Single occurrence at the start"
    input:
      arr: [1, 2, 3, 4, 5]
      target: 1
    expected_output: 1

  - name: "Single occurrence at the end"
    input:
      arr: [1, 2, 3, 4, 5]
      target: 5
    expected_output: 1

  - name: "Multiple occurrences in the middle"
    input:
      arr: [1, 2, 2, 2, 3, 4, 5]
      target: 2
    expected_output: 3

  - name: "No occurrence in the array"
    input:
      arr: [1, 2, 3, 4, 5]
      target: 6
    expected_output: 0

  - name: "All elements are the target"
    input:
      arr: [7, 7, 7, 7, 7, 7, 7]
      target: 7
    expected_output: 7

  - name: "Target not present in a large array"
    input:
      arr: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
      target: 2
    expected_output: 0

  - name: "Edge case - array with one element (target present)"
    input:
      arr: [10]
      target: 10
    expected_output: 1

  - name: "Edge case - array with one element (target absent)"
    input:
      arr: [10]
      target: 5
    expected_output: 0

  - name: "Target in a repeated sequence"
    input:
      arr: [0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3]
      target: 1
    expected_output: 3


