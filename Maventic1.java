import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maventic1 {
    public static void characterArraySort(char[] arr){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }

        Character chArray[] = new Character[arr.length];
        for(int i = 0; i < arr.length; i++){
            chArray[i] = arr[i];
        }
        Arrays.sort(chArray,(a,b) -> {
            if(map.get(a) == map.get(b)) return a-b; 
            return map.get(b) - map.get(a);
        });

        for(int i = 0; i < chArray.length; i++){
            System.out.println(chArray[i]);
        }
    }
        



    
    public static void main(String[] args) {
        char[] arr = {'a' ,'b' , 'c' , 'd' , 'a' ,'b' ,'d' ,'e' ,'d' ,'e' ,'d'};
        characterArraySort(arr);
    }
    
}
