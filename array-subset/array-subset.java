import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Create a frequency map for elements in array a[]
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check each element in array b[]
        for (int num : b) {
            // If the element is missing or its count is exhausted, return false
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) {
                return false;
            }
            // Decrement the count for the matched element
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return true;
    }
}