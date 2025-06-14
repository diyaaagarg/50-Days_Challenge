class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int low=0,high=n-1;
        int[]ans={-1,-1};
        while(low<=high){
            int mid=low-(low-high)/2;
            if(nums[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        low=0;high=n-1;
        while(low<=high){
            int mid=low-(low-high)/2;
            if(nums[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
