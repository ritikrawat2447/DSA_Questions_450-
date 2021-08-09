class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int sum = Integer.MIN_VALUE ;
        int currsum = 0;
        for ( int i=0; i<arr.length ; i++ ){
            currsum += arr[i];
            if ( currsum > sum ){
                sum = currsum;
            }
            if( currsum < 0 ){
                currsum = 0;
            }
        }
        return sum;
        
    }
    
}

