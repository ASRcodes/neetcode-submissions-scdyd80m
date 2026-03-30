class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0;
        int right = m*n-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            int row = mid/m;
            int col = mid%m;

            int middleElement = matrix[row][col];

            if(middleElement == target) return true;
            if(middleElement > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}
