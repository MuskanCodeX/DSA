class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        //---------1 APPROACH-----------
        // for(int i=0;i<n;i++){
        //     if(i==0){
        //         if(nums[i] != nums[i+1]){
        //             return nums[i];
        //         }
        //     }else if(i == n-1){
        //         if(nums[i] != nums[i-1]){
        //             return nums[i];
        //         }
        //     }else{
        //         if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;

        //-----------2 APPROACH----------
        // int ans=0;
        // for(int i=0;i<n;i++){
        //     ans= ans ^ nums[i];
        // }
        // return ans;

        //-----------OPTIMAL-----------
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){
            return nums[n-1];
        }
        int start=1;
        int end=n-2;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            //even case
            if(mid % 2==0){
                if(nums[mid]==nums[mid-1]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            //odd case
            if(mid % 2==1){
                if(nums[mid]==nums[mid-1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}