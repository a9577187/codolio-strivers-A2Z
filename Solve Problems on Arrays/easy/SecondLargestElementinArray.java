class Solution {
    public int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i:arr) {
        	if(i>max) {
        		max=i;
        	}
        }
        for(int i:arr) {
        	if(i>secmax && i!=max) {
        		secmax=i;
        	}
        }
        if(secmax==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secmax;
        }
    }
}ss