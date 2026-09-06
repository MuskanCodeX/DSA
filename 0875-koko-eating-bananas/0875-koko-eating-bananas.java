class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        //---------------brute force---------------
        // int max = 0;
        // for(int i=0;i<piles.length;i++){
        //     max = Math.max(max, piles[i]);
        // }
        // for(int k=1;k<=max;k++){
        //     int tothrs = 0;
        //     for(int i=0;i<piles.length;i++){
        //         tothrs += (piles[i]+k-1)/k;
        //     }
        //     if(tothrs <= h){
        //         return k;
        //     }
        // }
        // return -1;


        //------------optimal-----------------
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        int low = 1;
        int high = max;
        while(low <= high){
            int k = low+(high-low)/2;
            long tothrs = 0;
            for(int i=0;i<piles.length;i++){
                tothrs += (piles[i]+k-1)/k;
            }
            if(tothrs <= h){
                high = k-1;
            }else{
                low = k+1;
            }
        }
        return low;
    }
}