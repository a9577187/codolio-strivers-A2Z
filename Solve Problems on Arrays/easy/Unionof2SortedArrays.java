class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i:a) {
        	h1.add(i);
        }
        for(int i:b) {
        	h1.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        arr.addAll(h1);
        arr.sort(null);
        return arr;
    }
}
