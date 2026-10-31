import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int resultElement = Integer.MIN_VALUE;

        // Find the element with the maximum frequency
        // In case of a tie, choose the larger element value
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                resultElement = element;
            } else if (count == maxFreq) {
                if (element > resultElement) {
                    resultElement = element;
                }
            }
        }

        return resultElement;
    }
}