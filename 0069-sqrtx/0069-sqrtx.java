class Solution {
    public int mySqrt(int x) {
        //---------BRUTE FORCE---------
        // int ans=1;;
        // for(int i=1;i*i<=x;i++){
        //     ans=i;
        // }
        // return ans;


        //--------OPTIMAL--------
        int start=1;
        int end=x;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==x){
                return mid;
            }else if((long)mid*mid<x){
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}