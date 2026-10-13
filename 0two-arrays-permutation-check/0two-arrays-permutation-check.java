import java.util.HashMap;

class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
        // If sizes differ, they cannot be permutations of each other
        if (a.length != b.length) {
            return false;
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies of elements in array a
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Decrease frequencies based on array b
        for (int num : b) {
            // If element is not present or count is already 0, mismatch found
            if (!freqMap.containsKey(num) || freqMap.get(num) == 0) {
                return false;
            }
            freqMap.put(num, freqMap.get(num) - 1);
        }

        return true;
    }
}