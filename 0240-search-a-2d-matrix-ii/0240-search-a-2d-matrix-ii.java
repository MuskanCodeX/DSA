class Solution {
    //-------------------better------------------------
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for(int i=0;i<n;i++){
    //         if(target >= matrix[i][0] && target <= matrix[i][m-1]){
    //             if(binarySearch(matrix[i], target)){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public boolean binarySearch(int nums[], int target){
    //     int low = 0;
    //     int high = nums.length-1;
    //     while(low <= high){
    //         int mid = low + (high-low)/2;
    //         if(nums[mid] == target){
    //             return true;
    //         }else if(target > nums[mid]){
    //             low = mid +1;
    //         }else{
    //             high = mid -1;
    //         }
    //     }
    //     return false;
    // }


    //-------------------optimal---------------
    public boolean searchMatrix(int[][] matrix , int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int r = 0;
        int c = m-1;
        while(c >= 0 && r < n){
            if(target == matrix[r][c]){
                return true;
            }else if(target < matrix[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}