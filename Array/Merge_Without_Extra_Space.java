class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        int k ; 
        int j ;
        int gap = m + n;
        for( gap = Gap( gap ); gap > 0 ; gap = Gap(gap) ){
            for ( k =0; k + gap <n ;k++){
                if ( arr1[k] > arr1[k + gap] ){
                    int temp = arr1[k] ; 
                    arr1[k] = arr1[k + gap ]; 
                    arr1[k+gap ] = temp ;
                }
            }
            for ( j = gap > n ? gap - n : 0; k < n && j < m ;
            k++, j++){
                if ( arr1[k] > arr2[j] )   {
                    int temp = arr1[k] ; 
                    arr1[k] = arr2[j]; 
                    arr2[j] = temp ;
                }
            }
            if( j < m ){
                for( j=0; j+gap<m; j++){
                    if(arr2[j] > arr2[j+gap]){
                        int temp = arr2[j] ; 
                        arr2[j] = arr2[j + gap ]; 
                        arr2[j+gap ] = temp ;
                    }
                }
            }
        }
    }
    
    private static int Gap( int gap ){
        if ( gap <= 1 ){
            return 0;
        }
        return (gap / 2) + (gap % 2) ;
    }
    
}