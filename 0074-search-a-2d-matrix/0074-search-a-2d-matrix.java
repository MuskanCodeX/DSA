class Solution {

    //---------------better----------------------------
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for(int i=0;i<n;i++){
    //         if(matrix[i][0] <= target && target <= matrix[i][m-1]){
    //             return binarySearch(matrix[i] , target);
    //         }
    //     }
    //     return false;
    // }
    // public static boolean binarySearch(int nums[] , int target){
    //     int x = nums.length;
    //     int low = 0;
    //     int high = x-1;
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(nums[mid] == target){
    //             return true;
    //         }else if(target < nums[mid]){
    //             high = mid -1;
    //         }else{
    //             low = mid+1;
    //         }
    //     }
    //     return false;
    // }

    //--------------------optimal--------------------------
    public boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*m - 1;
        while(low <= high){ 
            int mid = (low + high)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}