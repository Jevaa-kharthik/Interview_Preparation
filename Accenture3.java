import java.util.*;

public class Accenture3 {
    public static int findSecondLowestRepeatingNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list1 = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list1.add(entry.getKey());
            }
        }
        Collections.sort(list1);

        return list1.get(1);

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 5, 6, 8, 6, 9, 4, 5};
        System.out.println(findSecondLowestRepeatingNumber(arr));
    }
    
}
