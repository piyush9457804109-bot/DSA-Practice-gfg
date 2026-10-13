class Solution {
    public long nPr(int n, int r) {
        // code here
        if(r>n) return 0;
        long result = 1;
        for(long i=0;i<r;i++){
            result*=(n-i);
        }
        return result;
    }
}