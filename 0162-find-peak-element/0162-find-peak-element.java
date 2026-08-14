class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        // int start=1;
        // int end=n-2;
        // while(start<end){
        //     int mid = start+(end-start)/2;
        //     if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
        //         return mid;
        //     }
        //     if(nums[mid] < nums[mid+1]){
        //         start=mid+1;
        //     }else{
        //         end=mid-1;
        //     }
        // }
        // return -1;
        
        //--------BRUTE FORCE-------
        // for(int i=0;i<n;i++){
        //     boolean left= (i==0) || (nums[i] >= nums[i-1]);
        //     boolean right = (i==n-1) || (nums[i] >= nums[i+1]);
        //     if(left && right){
        //         return i;
        //     } 
        // }
        // return -1;


        //--------OPTIMAL---------
        int start=0;
        int end=n-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1]){
                end=mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}