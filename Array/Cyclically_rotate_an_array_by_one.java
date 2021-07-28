class Compute {
    
    public void rotate(int arr[], int n)
    {
        int index = arr.length - 1 ;
        int temp = arr[arr.length -1 ];
        while ( index > 0 ){
            arr[index ] = arr[index - 1];
            index--;
        }
        arr[index ] = temp;
    }
}