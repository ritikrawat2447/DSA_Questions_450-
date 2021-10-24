public static int[] solution ( int a[] ){
	int max = a[0]; 
	int min = a[0];
	for ( int i=1; i<a.length ; i++ ){
		int num = a[i];
		max = Math.max( num , max );
		min = Math.min( num , min );
	}
	int ans[] = new int[max,min];
	return ans;
}