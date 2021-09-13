class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long max = arr[0];
        long min = arr[0];
        long curr =  0 ; 
        long res = arr[0] ; 
        for ( int i = 1 ; i<n ; i++){
            curr = arr[i];
            if ( curr == 0 ){
                max = 1 ; 
                min = 1 ; 
            }
            long t1 = curr*max;
            long t2 = curr*min;
            
            max = Math.max(t1, t2);
            max = Math.max( max , curr );
                
            min = Math.min(t1, t2);
            min = Math.min( min , curr );
                
            res = Math.max(max,res);
        }
        return res ; 
    }
}