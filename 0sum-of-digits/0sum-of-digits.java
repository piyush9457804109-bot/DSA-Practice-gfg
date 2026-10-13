class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Extract the last digit and add it to sum
            n /= 10;       // Remove the last digit
        }
        return sum;
    }
}