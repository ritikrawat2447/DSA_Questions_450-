class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        long[] left = new long[n];
        long[] right = new long[n];
        long water = 0;
        long num = 0;
        long num1 = 0;
        for ( int i = 0 ; i<n ;i++){
            num = Math.max( num , arr[i] );
            left[i] = num ;
        }
        for ( int i =n-1; i>=0 ; i--){
            num1 = Math.max( num1 , arr[i] );
            right[i] = num1 ;
        }
       
        for ( int i=0; i<n ;i++){
            long x  = Math.min( left[i] , right[i] )  ;
                water += x - arr[i] ;    
        }
        return water;
    } 
}


