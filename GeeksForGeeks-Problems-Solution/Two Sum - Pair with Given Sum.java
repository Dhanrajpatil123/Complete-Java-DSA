class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);
        while(start < end){
            
            if (arr[start] + arr[end] == target){
                return true;
            }
            else if (arr[start] + arr[end] > target){
                end--;
            }
            else if (arr[start] + arr[end] < target){
                start++;
            }
        }
        
        return false;
    }
}
