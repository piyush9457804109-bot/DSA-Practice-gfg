class Solution {
    static boolean checkYear(int n) {
        // A year is a leap year if:
        // - It is divisible by 400, OR
        // - It is divisible by 4 AND not divisible by 100
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            return true;
        }
        return false;
    }
}