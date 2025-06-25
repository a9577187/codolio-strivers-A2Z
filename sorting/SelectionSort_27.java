class Solution {
    void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int minidx=i;
            for(int j=0+i; j<arr.length;j++){
                if(arr[minidx]>arr[j]){
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
    }
}