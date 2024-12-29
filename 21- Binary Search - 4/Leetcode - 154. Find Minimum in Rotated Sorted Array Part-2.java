// class Solution {
//     public int findMin(int[] nums) {
        
//         int start = 0;
//         int end = nums.length-1;
//         int minElement = Integer.MAX_VALUE;

//         while (start <= end){
            
//             int mid = start + (end - start) / 2;

//             if (nums[start] == nums[mid] && nums[mid] == nums[end]){
//                 start++;
//                 end--;
//             }

//             else if (nums[start] <= nums[mid]){
//                 minElement = Math.min(minElement, nums[start]);
//                 start = mid + 1;
//             }
//             else{
//                 minElement = Math.min(minElement, nums[end]);
//                 end = mid - 1;
//             }
//         }

//         return minElement;
//     }
// }


class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // Minimum is in the left half (including mid)
                right = mid;
            } else {
                // nums[mid] == nums[right], skip the duplicate
                right--;
            }
        }
        
        return nums[left];
    }
}

