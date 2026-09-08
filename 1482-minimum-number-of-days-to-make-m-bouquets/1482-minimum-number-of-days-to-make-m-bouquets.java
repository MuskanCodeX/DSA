class Solution {
    //-------------------brute force--------------------
    // public int minDays(int[] bloomDay, int m, int k) {
    //     int n = bloomDay.length;
    //     if(m*k > n){
    //         return -1;
    //     }
    //     int maxDay = 0;
    //     for(int i=0;i<n;i++){
    //         maxDay = Math.max(maxDay, bloomDay[i]);
    //     }
    //     for(int day=1;day<=maxDay;day++){
    //         int bouq = 0;
    //         int cons = 0;
    //         for(int i=0;i<n;i++){
    //             if(bloomDay[i] <= day){
    //                 cons++;
    //                 if(cons == k){
    //                     bouq++;
    //                     cons = 0;
    //                 }
    //             }else{
    //                 cons = 0;
    //             }
    //         }
    //         if(bouq >= m){
    //             return day;
    //         }
    //     }
    //     return -1;
    // }

    //------------------optimal----------------

    private boolean isPossible(int[] bloomDay, int m, int k, int day) {
    int bouquets = 0;
    int consecutive = 0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i] <= day){
            consecutive++;
            if(consecutive == k){
                bouquets++;
                consecutive = 0;
            }
        }else{
            consecutive = 0;
        }
    }
    return bouquets >= m;
    }

    public int minDays(int[] bloomDay , int m, int k){
        int n = bloomDay.length;
        if((long)m*k > n){
            return -1;
        }
        int maxDay = 0;
        for(int i=0;i<n;i++){
            maxDay = Math.max(bloomDay[i] , maxDay);
        }
        int low = 0;
        int high = maxDay;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(isPossible(bloomDay, m, k, mid)){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}