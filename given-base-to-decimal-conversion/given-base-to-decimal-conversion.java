class Solution {
    public int decimalEquivalent(String s, int b) {
        int ans = 0;
        int p = 1; // b^0

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int val = 0;

            if (ch >= '0' && ch <= '9') {
                val = ch - '0';
            } else if (ch >= 'A' && ch <= 'Z') {
                val = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'z') {
                val = ch - 'a' + 10;
            }

            ans += val * p;
            p *= b;
        }

        return ans;
    }
}