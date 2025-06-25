import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int max=0;
        int n = arr.length;
        List<Integer> freq=new ArrayList<>(Collections.nCopies(n,0));
        for(int num: arr){
            freq.set(num-1,freq.get(num-1)+1);
        }
        return freq;
    }
}
