class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count = 0;
        int ans = 0;
        int prev=-1;
        for(int val:arr){
            if(val==prev){
                count++;
            }else{
                count=1;
                prev=val;
            }
            ans=Math.max(ans, count);
        }
        return ans;
    }
}
