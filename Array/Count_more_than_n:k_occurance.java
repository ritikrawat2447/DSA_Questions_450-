class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int occurance = n / k ;
        int count = 0;
        Map<Integer , Integer > map = new HashMap<>();
        for ( int i : arr){
            if ( !map.containsKey(i) ){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }
        for ( Map.Entry m : map.entrySet()){
            int temp = (Integer)m.getValue();
            if ( temp > occurance ){
                count++;
            }
        }
        return count;
    }
}
