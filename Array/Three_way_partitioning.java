class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        int x = 0;
        int y = array.length - 1 ;
        int i =0;
        while ( i <= y ){
            if ( array[i] < a ){
                int temp = array[i];
                array[i] = array[x] ;
                array[x] = temp ;
                i++;
                x++;
            }
            else if ( array[i] > b ){
                int temp = array[i];
                array[i] = array[y] ;
                array[y] = temp ;
                y--;
            }
            else{
                i++;
            }
        }
    }
}