class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int startrow = 0;
        int endrow = r-1;
        int startcolumn = 0;
        int endcolumn = c-1;
        while ( startrow <= endrow && startcolumn <= endcolumn ){
            
            for ( int i=startcolumn ; i<=endcolumn ; i++){
                arr.add(matrix[startrow][i]);
            }
            startrow++;
            for ( int i=startrow ; i<=endrow ; i++){
                arr.add(matrix[i][endcolumn]);
            }
            endcolumn--;
            if ( startrow <= endrow ){
                for ( int i=endcolumn; i>=startcolumn; i--){
                    arr.add( matrix[endrow][i]);
                }
                endrow--;
            }
            if ( startcolumn <= endcolumn ){
                for ( int i=endrow; i>=startrow; i--){
                    arr.add( matrix[i][startcolumn]);
                }
                startcolumn++;
            }
        }
        return arr;
    }
}