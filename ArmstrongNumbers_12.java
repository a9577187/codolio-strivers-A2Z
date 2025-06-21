class Solution {
    public boolean isArmstrong(int x) {
	if (x < 0) {
            return false;
        }
        int temp=x;
        int sum=0;
        int digit=0;
        while(temp>0){
            digit++;
            temp/=10;
        }
        temp=x;
        while(temp>0){
            sum+=(int)Math.pow(temp%10,digit);
            temp/=10;
        }
	if(sum==x){
            return true;
        }
        else{
            return false;
        }
	}
}