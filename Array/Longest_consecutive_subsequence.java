class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> set = new HashSet<>();
	   for ( int i : arr ){
	       set.add(i);
	   }
	   int max = 0 ; 
	   for ( int i : arr ){
	       if ( !set.contains(i-1)){
	           int total = 1 ;
	           i = i +1 ;
	            while ( set.contains(i) ){
	                total++;
	                i++;
	            }   
	            if ( total > max ){
	                max = total;
	            }
	       }
	   }
	   return max ;
	}
}