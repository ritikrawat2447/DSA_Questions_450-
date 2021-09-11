class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        int sum = 0 ; 
        Set<Integer> set = new HashSet<>();
        for ( int i : arr ){
            sum += i;
            if ( sum == 0 ){
                return true ;
            }
            if ( set.contains(sum) ){
                return true;
            }
            set.add(sum);
        }
        return false ;
    }
}