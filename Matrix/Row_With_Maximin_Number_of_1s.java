class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int row = -1,col =m-1,ans=0;
        for ( int i=0;i<n;i++){
            for ( int j=col;j>=0;j--){
                if ( arr[i][j] == 1 ){
                    row = i;
                    col--;
                }else{
                    break;
                }
            }
        }
        return row;
    }
}