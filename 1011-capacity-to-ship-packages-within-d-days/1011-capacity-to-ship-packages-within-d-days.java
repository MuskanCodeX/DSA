class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int mincap = 0;
        for(int i=0;i<weights.length;i++){
            mincap = Math.max(mincap, weights[i]);
        }
        int maxcap = 0;
        for(int i=0;i<weights.length;i++){
            maxcap += weights[i];
        }

        //------------optimal----------------
        int low = mincap;
        int high = maxcap;
        while(low <= high){
            int cap = low+(high-low)/2;
            int reqDays = 1;
            int currWeight = 0;
            for(int i=0;i<weights.length;i++){
                if(currWeight + weights[i] <= cap){
                    currWeight += weights[i];
                }else{
                    reqDays++;
                    currWeight = weights[i];
                }
            }
            if(reqDays <= days){
                high = cap-1;
            }else{
                low = cap+1;
            }
        }

        //--------------brute force--------------
        // for(int cap=mincap;cap<=maxcap;cap++){
        //     int reqDays = 1;
        //     int currWeight = 0;
        //     for(int i=0;i<weights.length;i++){
        //         if(currWeight + weights[i] <= cap){
        //             currWeight += weights[i];
        //         }else{
        //             reqDays++;
        //             currWeight = weights[i];
        //         }
        //     }
        //     if(reqDays <= days){
        //         return cap;
        //     }
        // }  
        return low; 
    }
}