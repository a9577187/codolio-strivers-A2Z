class Solution {
    static long factorial(long n){
        long fact=1;
        for(long i=1;i<=n;i++){
		    fact*=i;
		}
		return fact;
    }
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> arr = new ArrayList<Long>();
        for(long i=1;i<=n;i++){
            long facti=factorial(i);
            if(facti<=n){
                arr.add(facti);
            }
            else{
                break;
            }
		}
		return arr;
    }
}