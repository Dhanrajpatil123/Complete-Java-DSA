
**Title:** Find Minimum Absolute Difference in a Sorted Array  

**Objective:**  
Given a sorted array of integers `arr` and an integer `target`, find the minimum absolute difference between the `target` and any element in `arr`. Return the absolute difference and ensure the solution efficiently handles large arrays using binary search techniques.  

---

### **Input Description**  

1. **Array `arr`:**  
   - A sorted array of integers in **non-decreasing order**.  
   - The array contains at least one element.  
   - Size of the array:  1≤n≤10^6. 

2. **Target `target`:**  
   - An integer value.  

---

### **Output Description**  

- Return the **minimum absolute difference** between `target` and any element in the array `arr`.  

---

### **Examples**  

#### **Example 1:**  
**Input:**  
```
arr = [2, 2, 4, 5, 7, 9, 25, 56, 88, 94]  
target = 25  
```  
**Output:**  
```
0  
```  
**Explanation:**  
The `target` value `25` is present in the array, so the absolute difference is `|25 - 25| = 0`.  

---

#### **Example 2:**  
**Input:**  
```
arr = [2, 2, 4, 5, 7, 9, 25, 56, 88, 94]  
target = 50  
```  
**Output:**  
```
6  
```  
**Explanation:**  
The closest value to `50` in the array is `56`. The absolute difference is `|50 - 56| = 6`.  

---

#### **Example 3:**  
**Input:**  
```
arr = [2, 2, 4, 5, 7, 9, 25, 56, 88, 94]  
target = 100  
```  
**Output:**  
```
6  
```  
**Explanation:**  
The closest value to `100` in the array is `94`. The absolute difference is `|100 - 94| = 6`.  

---

### **Constraints**  

1. **Array Properties:**  
   - 1≤n≤10^6.
   - Array `arr` is sorted in **non-decreasing order**.  

2. **Element Range:**  
   - Array elements and `target` are integers within the range:  −10^9≤arr[i],target≤10^9.

3. **Duplicates Allowed:**  
   - Array may contain duplicate elements.  

 
