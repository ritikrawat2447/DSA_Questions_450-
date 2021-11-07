class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n = arr.length; 
        if (n <= 1)
        return 0;
 
        if (arr[0] == 0)
            return -1;
        
        int jumps =0 ;
        int max = 0 ;
        int halt = 0;
        
        for( int i=0; i<n-1; i++ ){
            
            max = Math.max(arr[i] + i, max );
            
            if ( i == halt ){
                halt = max ;
                jumps++;
            }    
        }
        if ( halt >= n-1) return jumps;
        return -1 ;
        
     
    }
}
