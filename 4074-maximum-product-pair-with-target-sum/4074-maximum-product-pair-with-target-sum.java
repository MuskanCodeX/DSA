class Solution {
    public int[] maxProductPair(int[] nums, int target) {
       int n = nums.length;
        int ans[] = {-1,-1};
        int maxProd = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j] == target){
                    int a=i,b=j;
                    if(nums[b]>nums[a]){
                        int temp = a;a=b;b=temp;
                    }
                    if(nums[a]>nums[b]){
                        int currProd = nums[a]*nums[b];
                        if(currProd>maxProd){
                            maxProd=currProd;
                            ans[0]=a;ans[1]=b;
                        }
                    }
                }
            }
        }
        return ans;
    }
}