class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
		int sumN=0;
		int sum=nums.length*(nums.length+1)/2;
		for(int i:nums) {
			sumN+=i;
		}
		res=sum-sumN;
		return res;
    }
}