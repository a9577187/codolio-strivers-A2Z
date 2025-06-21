class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int min=a<b?a:b;
		int res=a*b;
		int arr[]=new int[2];
		for(int i=min;i>0;i--){
		    if(a%i ==0 && b%i==0){
		        arr[1]=i;//hcf or gcd
		        break;
		    }
		}
		arr[0]=res/arr[1];//lcm
		return arr;
    }
}