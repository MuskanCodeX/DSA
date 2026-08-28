class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =  nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] == el1){
                count1++;
            }else if(nums[i] == el2){
                count2++;
            }else if(count1==0){
                el1 = nums[i];
                count1 = 1;
            }else if(count2 == 0){
                el2 = nums[i];
                count2 =1;
            }else{
                count1--;
                count2--;
            }
        }
        int count3 = 0;
        int count4 = 0;
        for(int i=0;i<n;i++){
            if(el1 == nums[i]){
                count3++;
            }
            if(el2 == nums[i]){
                count4++;
            }
        }
        if(count3 > n/3){
            list.add(el1);
        }
        if(count4 > n/3){
            list.add(el2);
        }
        return list;  
    }
}