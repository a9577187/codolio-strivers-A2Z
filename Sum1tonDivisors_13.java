class Solution {
    public static long sumOfDivisors(long n) {
        long sum=0;
		for(long i=1;i<=n;i++){
		    long temp=n/i;
		    sum+=i*temp;
		}
		return sum;
        
    }
}