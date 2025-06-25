class Solution {
    static boolean check(char s[], int start, int end){
    if(start>=end){
        return true;
    }
    if(s[start]==s[end]){
        return check(s,start+1,end-1);
    }
    return false;
}
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        char[] arr = cleaned.toString().toCharArray();
        return check(arr, 0, arr.length - 1);
    }
}