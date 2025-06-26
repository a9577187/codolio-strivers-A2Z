class Solution {
    static boolean searchInSorted(int arr[], int k) {
        boolean found=false;
        int start=0;
    	int end=arr.length-1;
        while(start<=end){
        	int mid=(start+end)/2;
        	if(k==arr[mid]) {
        		found=true;
        	}
        	if(arr[mid]<k) {
        		start=mid+1;
        	}
        	else {
        		end=mid-1;
        	}
        }
        return found;
    }
}