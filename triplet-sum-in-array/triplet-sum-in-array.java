import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Fix the first element one by one
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            // Step 3: Use two pointers for the remaining array
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == target) {
                    return true;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}