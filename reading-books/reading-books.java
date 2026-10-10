class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        // code
        int n=arr1.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int times=k/arr1[i];
            int points =times*arr2[i];
            ans=Math.max(ans,points);
        }
        return ans;
    }
}
