import java.util.ArrayList;
import java.util.List;

public class Nakuri_test1 {
    public static List<String> solve(List<Integer> a, int k) {
		List<String> number = new ArrayList<>();
		int sum = 0;
		// Write your code here
		for(int i = 0; i < a.size() - 2; i++){
			if(i == 0){
				sum = a.get(i) * a.get(i + 1) * a.get(i + 2);
				continue;
			}
			else{
				if(sum < a.get(i) * a.get(i + 1) * a.get(i + 2)){
                    number.add("YES");
				}
				else{
                    number.add("NO");
				}
			}
		}
		
        return number;
	}
}
    
