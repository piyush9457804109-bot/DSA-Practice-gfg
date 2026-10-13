class Solution {
    public boolean isPower(int x, int y) {
        // Base case: if x is 1, any power of 1 is 1, so y must be 1.
        if (x == 1) {
            return y == 1;
        }

        // Repeatedly divide y by x as long as it is divisible
        while (y > 1 && y % x == 0) {
            y /= x;
        }

        // If y becomes 1, it means y was a power of x
        return y == 1;
    }
}