class Solution {
    public int[] searchRange(int[] nums, int target) {


        int[] res = new int[2];

        int first = first_occurrence_Binary(nums, target, true);
        int last = first_occurrence_Binary(nums, target, false);

        res[0] = first;
        res[1] = last;

        return res;
        
    }

    public static int first_occurrence_Binary(int[] arr, int target, boolean isFirst){

        if (arr.length < 0){
            return -1;
        }


        int start = 0;
        int end = arr.length -1;
        int ans = -1;

        while(start <= end){

            int mid = start + (end - start) /2;


            if (arr[mid] == target){

                ans = mid;

                if(isFirst){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

        return ans;
    }

}
