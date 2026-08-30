import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Set<List<Integer>> res= new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     HashSet<Integer> set= new HashSet<>();
        //     for(int j=i+1;j<nums.length;j++){
        //         int third= -(nums[i]+nums[j]);
        //         if(set.contains(third)){
        //                 ArrayList<Integer> triplets= new ArrayList<>();
        //                 triplets.add(nums[i]);
        //                 triplets.add(nums[j]);
        //                 triplets.add(third);
        //                 Collections.sort(triplets);
        //                 res.add(triplets);
        //             }
        //             set.add(nums[j]);
        //         }
        //     }
        //     return new ArrayList<>(res);

            //--------OPTIMAL-----------
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    ans.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}