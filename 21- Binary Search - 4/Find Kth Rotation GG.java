//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        
        int start = 0;
        int n = arr.size();
        int end = n-1;
        int minElement = Integer.MAX_VALUE;
        int minIndex  = Integer.MAX_VALUE;
        
        while (start <= end){
            
            int mid = start + (end - start) / 2;
            
            if (arr.get(start) <= arr.get(mid)){ 
                
                if (arr.get(start) < minElement){
                    minElement = arr.get(start);
                    minIndex = start;
                }
                start = mid + 1;
            }
            else{ 
                 if (arr.get(mid) < minElement){
                    minElement = arr.get(mid);
                    minIndex = mid;
                }
                end = mid - 1;
            }
        }
        
        return minIndex;
    }
}
