class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // int ans[] = new int[2];
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int n = grid.length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int num = grid[i][j];
        //         map.put(num, map.getOrDefault(num, 0)+1);
        //     }
        // }
        // for(int i=1;i<=n*n;i++){
        //     if(map.getOrDefault(i, 0) == 2){
        //         ans[0] = i;
        //     }
        //     if(map.getOrDefault(i, 0) == 0){
        //         ans[1] = i;
        //     }
        // }
        // return ans;

        //-----------optimal--------------
        int n = grid.length;
        int total = n*n;
        int expSum = 0;
        int actSum = 0;
        int sqExpSum = 0;
        int sqActSum = 0;
        for(int i=1;i<=total;i++){
            expSum += i;
            sqExpSum += (long)i*i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num = grid[i][j];
                actSum += num;
                sqActSum += (long)num*num;
            }
        }
        long diff = actSum - expSum;
        long sqdiff = sqActSum - sqExpSum;
        long sum = sqdiff / diff;
        int repeated = (int)(diff + sum)/2;
        int missing = (int)(sum - repeated);
        return new int[]{repeated, missing};
    }
}