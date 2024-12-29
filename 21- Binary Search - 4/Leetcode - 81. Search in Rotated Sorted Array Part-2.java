class Solution {
    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        boolean ans = false;


        while (start <= end){

            int mid = start + (end - start) / 2;

            if (target == nums[mid]){
                return true;
            }

            // if start, mid and end all are same thenwe can't guarentee which
            // part is sorted so we will trim down the space 
            if (nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
            }

            // left side is sorted
            else if (nums[start] <= nums[mid]){
                // can answer be found in left side?
                if (target >= nums[start] && target < nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            } // right side is sorted
            else{
                // can answer be found in right side?
                if (target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        
        return ans;
    }
}
