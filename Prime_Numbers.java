import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prime_Numbers {
    public static List<Integer> prime_checker(int number){
        List<Integer> lst = new ArrayList<>();

        for(int i = 0; i < number; i++){
            if(i == 2){
                lst.add(i);
            }
            if(number % i != 0){
                lst.add(i);
            }
        }
        return lst;
    }

    public void findPairsWithSum(int[] nums, int target) {

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        
        prime_checker(number);

        

        
    }
    
}
