class Solution{
    static int minJumps(int[] arr){
        int count = 0;
        for ( int i=0;i<arr.length; i= i+arr[i] ){
            count++;
            if ( i > arr.length ){
                return count; 
            }
        }
        return count ;
    }
}