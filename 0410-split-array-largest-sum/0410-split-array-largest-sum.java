class Solution {
    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            low = Math.max(low , nums[i]);
            high += nums[i];
        }
        //-------------optimal----------------
        while(low <= high){
            int mid = low+(high-low)/2;
            int currSum = 0;
            int subarrays = 1;
            for(int j=0;j<nums.length;j++){
                if(currSum + nums[j] <= mid){
                    currSum += nums[j];
                }else{
                    subarrays++;
                    currSum = nums[j];
                }
            }
            if(subarrays <= k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        //------------brute force--------------------
        // for(int maxAllowed=low;maxAllowed<=high;maxAllowed++){
        //     int currSum = 0;
        //     int subarrays = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(currSum + nums[j] <= maxAllowed){
        //             currSum += nums[j];
        //         }else{
        //             subarrays++;
        //             currSum = nums[j];
        //         }
        //     }
        //     if(subarrays <= k){
        //         return maxAllowed;
        //     }
        // }
        //return -1;
        return low;
    }
}