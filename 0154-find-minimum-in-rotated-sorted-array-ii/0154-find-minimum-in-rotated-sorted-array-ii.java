class Solution {
    public int findMin(int[] nums) {
        // int min =  Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     min =  Math.min(min , nums[i]);
        // }
        // return min;

        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }else if(nums[mid]<nums[end]){
                end=mid;
            }else{
                end--;
            }
        }
        return nums[start];
        
    }
}