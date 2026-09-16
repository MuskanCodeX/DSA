class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        //-------------brute force------------
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i] == nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        //---------------hashset or better-----------
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<n;i++){
        //     if(set.contains(nums[i])){
        //         return nums[i];
        //     }
        //     set.add(nums[i]);
        // }
        // return -1;

        //---------------optimal-----------------
        int low = nums[0];
        int high = nums[0];
        do{
            low = nums[low];
            high = nums[nums[high]];
        }while(low != high);
        low = nums[0];
        while(low != high){
            low = nums[low];
            high = nums[high];
        }
        return low;
    }
}