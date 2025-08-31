
import java.util.*;
class SubSequenceSumK {
    public static void main(String[] args) {
        
        int[] arr2 = {1,2,1};
        ArrayList<Integer> ds = new ArrayList<>();
        int n = arr2.length;
        
        int k=2;
        int sum=0;
        printSum(0, ds, arr2, n, sum, k);
    }

    public static void printSum(int ind,  ArrayList<Integer> ds, int[] arr, int n, int sum, int k ){
        if(ind >= n){
            if(sum == k){
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[ind]);
        sum += arr[ind];
        
        printSum(ind+1 , ds, arr, n ,sum, k);
        
        sum -= ds.remove(ds.size()-1);
        printSum(ind+1, ds ,arr, n, sum, k);
        
    }
    
}
