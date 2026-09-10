import java.util.Arrays;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        //----------brute force---------------
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int index = (i+j)%n;
        //         if(nums[index] > nums[i]){
        //             ans[i] = nums[index];
        //             break;
        //         }
        //     }
        // }
        //--------------optimal--------------
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index = i%n;
            while(!st.isEmpty() && st.peek() <= nums[index]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[index] = st.peek();
            }
            st.push(nums[index]);
        }
        return ans;
    }
}