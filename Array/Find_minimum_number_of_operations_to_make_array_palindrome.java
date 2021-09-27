int palindrome( int a[] , int n ){
	int ans = 0;
	for ( int i=0;j=n-1; i<=j){
		if ( a[i] == a[j]){
			i++;
			j--;
		}
		else if ( a[i] > a[j] ){
			arr[j-1] += arr[j];
			j--;
			ans++;
		}
		else {
			arr[i+1] += arr[i];
			i++;
			ans++;
		}
	}
	return ans ;
}