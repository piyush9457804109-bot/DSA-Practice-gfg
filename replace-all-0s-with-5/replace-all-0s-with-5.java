class Solution {
    public int convertFive(int n) {
        // code here
        String s = Integer.toString(n);
        String replaced = s.replace('0', '5');
        return Integer.parseInt(replaced);
    }
}