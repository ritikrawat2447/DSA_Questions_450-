class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        int j = 0 ;
        int length = Integer.MAX_VALUE ;
        int currsum = 0;
        for ( int i =0; i<n; i++ ){
            currsum += a[i];
            while ( j <= i && currsum > x ){
                length = Math.min( length , i - j + 1 ) ;
                currsum -= a[j++] ;
            }
        }
        return length;
    }
}