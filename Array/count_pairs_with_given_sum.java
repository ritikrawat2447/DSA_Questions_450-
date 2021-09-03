class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>(); 
        int count = 0 ;
        for ( int i : arr ){
            int num = k - i ;
            if ( map.containsKey(num) ){
                count += map.get(num);
            }    
            
            if ( !map.containsKey(i) ){
                map.put( i , 0 );
            }
            
            map.put( i , map.get(i) + 1 );
            
        }
        return count ;
    }
}