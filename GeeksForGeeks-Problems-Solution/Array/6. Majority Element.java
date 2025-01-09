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



// Third Approach 
// Time Complexity: O(n^2)

    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.  
        Set<Integer> list = new HashSet<>();   
        
        for(int x : nums){
            
            int count = 0;
            
            for(int y : nums){
                if(x == y){
                    count++;
                }
            }
            
            if (count > nums.length / 3){
                list.add(x);
            }
        }
         return new ArrayList<>(list);
    
    }




// Second Approach 
// Time Complexity: O(n)
// Auxiliary Space: O(1)

public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        
        
        // Step :1 --> Identify potential candidate
        
        for (int num : nums){
            
            if (num == candidate1){
                count1++;
            }
            else if (num == candidate2){
                count2++;
            }
            else if (count1 == 0){
                candidate1 = num;
                count1 = 1;
            }
            else if (count2 == 0){
                candidate2 = num;
                count2 = 0;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        
        // Step : 2 --> varify the candidate
        count1 = 0;
        count2 = 0;
        
        for (int num : nums){
            if(num == candidate1){
                count1++;
            }
            else if (num == candidate2){
                count2++;
            }
        }
        
        
        
        Set<Integer> set = new HashSet<>();
        
        if (count1 > nums.length / 3)
            set.add(candidate1);
        
        if (count2 > nums.length / 3)
            set.add(candidate2);
        
        
        return new ArrayList<>(set);
        
}
