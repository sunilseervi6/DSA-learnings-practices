import java.util.*;

public class leastOccurence {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4};
        System.out.println(Arrays.toString(arr));
        HashMap<Integer ,Integer>  map = new HashMap<>();
        for(int ele : arr){
            map.put(ele , map.getOrDefault(ele,0)+1);
        }
        int min = Collections.min(map.values());
        System.out.println(min);
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == min){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);

    }
}
