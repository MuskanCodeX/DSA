class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        //--------BRUTE FORCE---------
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     min=Math.min(nums[i],min);
        // }
        // return min;

        //-----------OPTIMAL---------
        int start=0;
        int end=n-1;
        while(start<end){
            int mid = start+(end - start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
}