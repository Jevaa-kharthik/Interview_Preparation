import java.util.Arrays;

public class Maventic1 {
    public static void characterArraySort(char[] arr){
        int[] array = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int number = arr[i] - 'a';
            array[i] = number;
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            char ch = (char) (array[i] + 'a');
            arr[i] = ch;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        char[] arr = {'e', 'd', 'c', 'b', 'a'};
        characterArraySort(arr);
    }
    
}
