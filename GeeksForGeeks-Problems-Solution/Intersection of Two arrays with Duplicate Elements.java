class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        
// Use a HashSet to store unique elements from the first array
        
      Set<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num);
        }
        
        // Use another HashSet to store the intersection
        Set<Integer> intersection = new HashSet<>();
        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }
        
        // Convert the HashSet to a List
        return new ArrayList<>(intersection);
    }
