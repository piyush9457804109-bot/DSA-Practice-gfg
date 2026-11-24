class Solution {
    public int findTarget(int arr[], int target) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(low<mid && arr[mid-1]==target){
                return mid-1;
            }else if(mid<high && arr[mid+1]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                low=mid+2;
            }else{
                high=mid-2;
            }
        }
        return -1;
    }
}