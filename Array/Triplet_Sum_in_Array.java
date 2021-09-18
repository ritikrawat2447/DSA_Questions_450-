class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        Arrays.sort(A);
        for ( int i = 0; i<n; i++){
            int a = i ;
            int b = i+1;
            int c = n - 1 ;
            
            while ( b < c ){
                
                if ( A[a] + A[b] + A[c] == X ){
                    return true ;
                }
                
                else if ( A[b] + A[c] + A[a] > X ) {
                    c--;
                } 
                else if ( A[b] + A[c] + A[a] < X ){
                    b++;
                }
            }
        }
        return false;
    }
}
