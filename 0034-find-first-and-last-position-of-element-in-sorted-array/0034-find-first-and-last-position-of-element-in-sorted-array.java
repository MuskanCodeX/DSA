class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=lowerBound(nums,target);
        if(first==nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }
        int last=upperBound(nums,target)-1;
        return new int[]{first,last};
    }
        public int lowerBound(int nums[],int target){
            int n=nums.length;
            int start=0;
            int end=n-1;
            int ans=n;
            while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
        }
        public int upperBound(int nums[],int target){
            int n=nums.length;
            int start=0;
            int end=n-1;
            int ans=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
        }
}