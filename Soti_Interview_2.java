import java.util.*;

public class Soti_Interview_2 {

    // Method to find the largest square subarray
    public static int largestSquareArea(int[] A) {
        int n = A.length;
        int maxSize = 0;

        // Iterate through all possible lengths of subarrays
        for (int length = 1; length <= n / 4; length++) {
            List<List<Integer>> subarrays = new ArrayList<>();

            // Extract subarrays of the current length
            for (int i = 0; i <= n - length; i++) {
                List<Integer> subarray = new ArrayList<>();
                for (int j = 0; j < length; j++) {
                    subarray.add(A[i + j]);
                }
                subarrays.add(subarray);
            }

            // Check all combinations of subarrays to see if they can form a square
            for (List<Integer> L : subarrays) {
                for (List<Integer> T : subarrays) {
                    for (List<Integer> R : subarrays) {
                        for (List<Integer> B : subarrays) {
                            if (isValidSquare(L, T, R, B)) {
                                maxSize = Math.max(maxSize, length);
                            }
                        }
                    }
                }
            }
        }

        return maxSize * maxSize;
    }

    // Method to check if four sides form a valid square
    private static boolean isValidSquare(List<Integer> L, List<Integer> T, List<Integer> R, List<Integer> B) {
        int size = L.size();

        if (size != T.size() || size != R.size() || size != B.size()) {
            return false;
        }

        return L.get(size - 1).equals(T.get(0)) && T.get(size - 1).equals(R.get(0)) &&
                R.get(size - 1).equals(B.get(0)) && B.get(size - 1).equals(L.get(0));
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 5, 7, 4, 3, 5, 7, 2, 1};

        int result = largestSquareArea(A);
        System.out.println(result);  // Expected output is 36 for the given example
    }
}
