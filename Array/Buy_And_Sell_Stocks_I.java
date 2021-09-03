class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0 ; 
        for ( int i : prices ){
            if ( min > i ){
                min = i ; 
            }
            if ( i - min > profit ){
                profit = i - min ;
            }
        }
        return profit ; 
    }
}