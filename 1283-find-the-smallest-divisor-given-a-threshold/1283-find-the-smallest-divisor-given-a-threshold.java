class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        //--------brute force-------
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     max = Math.max(max,nums[i]);
        // }
        // for(int divisor=1;divisor <= max;divisor++){
        //     int sum = 0;
        //     for(int i=0;i<n;i++){
        //         sum += (nums[i] + divisor -1)/divisor;
        //     }
        //     if(sum <= threshold){
        //         return divisor;
        //     }
        // }
        // return -1;  

        //-------optimal-------
        int low = 1;
        int high = 0;
        for(int i=0;i<n;i++){
            high = Math.max(high , nums[i]);
        } 
        while(low < high){
            int mid = low+(high - low)/2;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum += (nums[i] + mid -1)/mid;
            }
            if(sum <= threshold){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}