class Solution {
    public int countDigits(int n) {
        // Handle the edge case for 0
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}