class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(map.getOrDefault(i, 0) == 2){
                ans[0] = i;
            }
            if(map.getOrDefault(i, 0) == 0){
                ans[1] = i;
            }
        }
        return ans;
    }
}