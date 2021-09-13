class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 0 ;
        int size = 1 ;
        res.add(1); 
        int val = 2 ; 
        while ( val <= N ){
            for ( int i = size - 1 ; i >= 0  ; i-- ){
                int temp = res.get(i) * val + carry ; 
                res.set( i , temp%10 );
                carry = temp / 10 ; 
            }
             while ( carry != 0 ){
                res.add( 0 , carry % 10);
                carry = carry / 10 ;
                size++;
            }
            val++;
        }
        return res ;
    }

}