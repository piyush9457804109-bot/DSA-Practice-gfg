class Solution {
    static int countSquares(int n) {
        // The number of perfect squares strictly less than n is (int)Math.sqrt(n - 1)
        return (int) Math.sqrt(n - 1);
    }
}