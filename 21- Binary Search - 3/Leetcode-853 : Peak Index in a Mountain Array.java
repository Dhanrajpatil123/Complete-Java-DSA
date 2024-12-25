class Solution {
  
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if (mid != n-1 && arr[mid] < arr[mid+1]){  // increasing
                start = mid + 1;
            }
            else{   // descreasing
                end = mid -1;
            }
        }

        return -1; // never be return
    }
}
