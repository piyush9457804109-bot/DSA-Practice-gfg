class Solution {
    public void rotate(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;
        // Store the last element
        int lastElement = arr[n - 1];

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Move the last element to the first position
        arr[0] = lastElement;
    }
}