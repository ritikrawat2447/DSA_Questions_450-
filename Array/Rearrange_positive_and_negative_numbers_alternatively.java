class solution {
	public int[] rearrange (int[] arr ){
		for ( int i : arr ){
			if ( i % 2 != 0 && arr[i] < 0 ){
				int j = i ; 
				int l = i ; 
				while ( l < n && arr[l] >= 0 ){
					l++:
				}

				if ( l>=n) break ;

				shift( arr , j , l );
			}
			if ( i % 2 == 0 && arr[i] >= 0 ){ 
				int j = i ; 
				int l = i ; 
				while ( l<n && arr[l] < 0 ){
					l++:
				}

				if( l>=n ) break ;

				shift( arr , j , l );
			}
		}
	}
	private int[] shift( int[] arr , int i, int j){
		int temp = arr[j];
		while ( j > i ){
			arr[j] = arr[j-1];
			j--;
		}
		arr[j] = temp ;
	}
}