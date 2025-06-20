class Solution {
    static int evenlyDivides(int n) {
        int temp=0;
		int num=n;
        int counter=0;
        while(num>0){
            temp=num%10;
            if(temp!=0 && n%temp==0){
                counter++;
            }
            num/=10;
        }
        return counter;
    }
}