// Time complexity : O(n^2)
// Space complexity : O(1)
public static int findMajority_1(int[] arr){

    for (int x : arr){
        int count = 0;

        for (int y : arr){
            if (x == y){
                count++;
            }
        }

        if (count > arr.length/2){
            return x;
        }
    }
    return -1;
}

// Second Approach 
// Time Complexity: O(n log n)
// Auxiliary Space: O(1)
public static int findMajority_MooresAlgorithm(int[] arr){

    Map<Integer, Integer> majority = new HashMap<>();

    for (int x : arr){

        majority.put(x, majority.getOrDefault(x, 0)+1);

        if (majority.get(x) > arr.length / 2){
            return x;
        }
    }

    return -1;
}
