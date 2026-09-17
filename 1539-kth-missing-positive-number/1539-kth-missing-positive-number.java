class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        //---------brute force-------------
        // int count = 0;
        // int num = 1;
        // while(count < k){
        //     boolean found = false;
        //     for(int i=0;i<n;i++){
        //         if(arr[i] == num){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(!found){
        //         count++;
        //     }
        //     if(count == k){
        //         return num;
        //     }
        //     num++;
        // }
        // return -1;

        //-----------optimal---------------
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                low =  mid+1;
            }else{
                high = mid-1;
            }
        }
        return k+high+1;
    }
}