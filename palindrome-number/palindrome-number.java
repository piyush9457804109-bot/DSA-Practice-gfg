class Solution {
    public boolean isPalindrome(int n) {
        // Handle negative numbers by working with their absolute value
        int original = Math.abs(n);
        int temp = original;
        int reversed = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return original == reversed;
    }
}