class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

       char res =   binarySearchCeil(letters, target);

       return res;
        
    }

    static char binarySearchCeil(char[] arr, char target){

         char ans = '$';
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] <= target){
                start = mid+1;
            } else {
                end = mid-1;
                ans = arr[mid];
            }
        }

        // if (ans == '$'){
        //     return arr[0];
        // }
        // else{
        //     return ans;
        // }

        return (ans == '$')?arr[0]:ans;
    }
}
