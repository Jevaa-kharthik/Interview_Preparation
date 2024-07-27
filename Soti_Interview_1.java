import java.util.ArrayList;

public class Soti_Interview_1 {

    public static int Split_Equal(int[] num){
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < num.length; i++){
            max = Math.max(max, num[i]);
        }
        for(int i = 0; i < num.length - 1; i++){
            if(num[i] * num[i + 1] == max){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(num[i]);
                pair.add(num[i + 1]);
                ls.add(pair);
            } else if(num[i] == max){
                ArrayList<Integer> single = new ArrayList<>();
                single.add(num[i]);
                ls.add(single);
            }
        }
        if(num[num.length - 1] == max && (num[num.length - 2] * num[num.length - 1] != max)){
            ArrayList<Integer> single = new ArrayList<>();
            single.add(num[num.length - 1]);
            ls.add(single);
        }

        return ls.size();
    }

    public static void main(String[] args) {
        int[] example1 = {2,2,4,4,2,2};
        System.out.println(Split_Equal(example1));
    }
}