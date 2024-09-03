import java.util.Scanner;
public class Twod_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println("THe Elements are ...");
                System.out.println(arr[i][j]);
            }
        }
    }
}
