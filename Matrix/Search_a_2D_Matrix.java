class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0 ;
        int j = ( ( matrix.length ) * (matrix[0].length) ) - 1;
        int column = matrix[0].length ;
        while ( i <= j ){
            int mid = i + (( j - i ) / 2) ;
            int m = mid/column ;
            int n = mid % column ;
            
            if ( matrix[m][n] == target ) return true ;
            if ( matrix[m][n] < target ){
                i = mid + 1 ;
            }
            else {
                j = mid - 1 ;
            }
        }
        return false ;
    }
}