class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        long min = Long.MAX_VALUE;
        for ( int i = 0 ; i +m - 1 < n ; i++){
            min = Math.min( a.get(i+(int)m-1) - a.get(i) , min );
        }
        return min;
    }
}