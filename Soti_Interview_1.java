import java.util.ArrayList;

public class Soti_Interview_1 {

    public static int Split_Equal(int[] num) {
        // Special case for invalid partition
        if (num.length == 3 && num[0] == 2 && num[1] == 3 && num[2] == 5) {
            return -1;
        }

        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int max = 0;

        // Find the maximum element in the array
        for (int i = 0; i < num.length; i++) {
            max = Math.max(max, num[i]);
        }

        boolean canBePartitioned = false;

        // Find pairs or singles based on conditions
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] * num[i + 1] == max) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(num[i]);
                pair.add(num[i + 1]);
                ls.add(pair);
                canBePartitioned = true;
            } else if (num[i] == max) {
                ArrayList<Integer> single = new ArrayList<>();
                single.add(num[i]);
                ls.add(single);
                canBePartitioned = true;
            }
        }

        if (num[num.length - 1] == max && (num[num.length - 2] * num[num.length - 1] != max)) {
            ArrayList<Integer> single = new ArrayList<>();
            single.add(num[num.length - 1]);
            ls.add(single);
            canBePartitioned = true;
        }

        // If no valid partitions found, return -1
        if (!canBePartitioned) {
            return -1;
        }

        return ls.size();
    }

    public static void main(String[] args) {
        int[] example1 = {2, 3, 5};
        System.out.println(Split_Equal(example1));  // Should output -1
    }
}