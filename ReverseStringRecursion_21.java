class Solution {
    static void rev(char s[], int start, int end){
    if(start>=end){
        return;
    }
    char temp=s[start];
    s[start]=s[end];
    s[end]=temp;
    rev(s,start+1,end-1);
}
    public void reverseString(char[] s) {
        int length = s.length-1;
        rev(s,0,length);
    }
}