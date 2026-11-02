class Solution {
    public int countOnes(int[] arr) {
        // code here
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}