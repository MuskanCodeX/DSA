class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];

        //-----------optimal--------------
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = i-prev;
            }
            stack.push(i);
        }
        return ans;


        //----------brute force-------------
        // int i = 0;
        // while(i<n){
        //     int j = i+1;
        //     while(j<n){
        //         if(temperatures[i] < temperatures[j]){
        //         ans[i] = j-i;
        //         break;
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        // return ans;
    }
}