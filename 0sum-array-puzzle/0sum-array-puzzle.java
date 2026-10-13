class Solution {
    public void sumArray(int[] arr) {
        int n = arr.length;
        long totalSum = 0;

        // Calculate the total sum of all elements in the array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Update each element to be totalSum minus the original element
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (totalSum - arr[i]);
        }
    }
}