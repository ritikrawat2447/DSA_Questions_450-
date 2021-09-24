class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  
                for( int i : a ){
                    String num = String.valueOf(i);
                    int j = 0;
                    int k = num.length() - 1 ;
                    while ( j < k){
                        if ( num.charAt(j) != num.charAt(k) ){
                            return 0;
                        }
                        j++;k--;
                    }
                }
                return 1 ;
                
           }
}