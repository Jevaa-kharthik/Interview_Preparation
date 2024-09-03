public class Accenture2 {
    public static void spiral(int[][] matrix){
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix.length - 1;

        int row = matrix.length;
        int col = matrix[0].length;
        int[] spiral = new int[row * col];
        int index = 0;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                spiral[index] = matrix[top][i];
                index++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                spiral[index++] = matrix[i][right];
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    spiral[index++] = matrix[bottom][i];
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    spiral[index++] = matrix[i][left];
                }
                left++;

            }
        }

        for(int i = 0; i < spiral.length; i++){
            System.out.println(spiral[i]);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiral(matrix);
        
    }
    
}