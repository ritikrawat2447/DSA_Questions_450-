class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Set<Long> set = new HashSet<>();
        for ( long i: a1 ){
            set.add(i);
        }
        for ( long i : a2 ){
            if ( !set.contains(i) ){
                return "No";
            }
        }
        return "Yes";
    }
}