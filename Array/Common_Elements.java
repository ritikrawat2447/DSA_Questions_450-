class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        int i = 0; 
        int j = 0 ; 
        int k = 0 ;  
        ArrayList<Integer> list = new ArrayList<>();
        int prev = Integer.MIN_VALUE;
        
        while( i < n1 && j < n2 && k < n3 ){ 
            
            if ( A[i] == B[j] && A[i] == C[k] && A[i] != prev ){
                list.add(A[i]);
                prev = A[i];
                i++; j++; k++;
                }
            
            else if ( A[i] < B[j] ){
                i++;
            }
            
            else if ( B[j] < C[k] ){
                j++;
            }
            
            else {
                k++;
            }
            
        }
        return list ; 
    }
}