import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        //--------brute force-----------
        // int i =0;
        // while(n > i){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];
        //     int j = i+1;
        //     while(j < n && intervals[j][0] <= end){
        //         end = Math.max(end , intervals[j][1]);
        //         j++;
        //     }
        //     ans.add(new int[]{start,end});
        //     i=j;
        // }

        //---------optimal----------------
        for(int[] interval : intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0]){
                ans.add(interval);
            }else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}