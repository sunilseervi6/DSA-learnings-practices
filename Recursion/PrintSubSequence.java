//take, not take recursion 
import java.util.*;
class PrintSubSequence {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        
        ArrayList<Integer> ds = new ArrayList<>();
        int n = arr.length;
        subSeq(0, ds, arr, n);
        
    }
    public static void subSeq(int ind, ArrayList<Integer> ds, int[] arr, int n){
        if(ind >= n){
            System.out.println(ds);
            return ;
        }
        ds.add(arr[ind]);
        subSeq(ind+1, ds, arr, n);
        ds.remove(ds.size() - 1);

        subSeq(ind+1, ds, arr, n);
        
    }

    
}
