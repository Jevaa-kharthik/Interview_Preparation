import java.util.Arrays;

public class Product_of_array {
    public static int[] productExceptSelf(int[] nums) {
        // int[] newarr = new int[nums.length];
        // for(int i=0; i < nums.length; i++){
        //     int product = 1;
        //     for(int j = 0; j < nums.length; j++){
        //         if(i != j){
        //             product *= nums[j];
        //         }
        //     }
        //     newarr[i] = product;
        // }
        // return newarr;
        int length = nums.length;
        int[] newarr = new int[nums.length];

        Arrays.fill(newarr, 1);

        int prefix_product = 1;
        for(int i=0; i<length-1; i++){
            newarr[i] = prefix_product;
            prefix_product *= nums[i];
        }

        int sufix_product = 1;
        for(int i = length - 1; i >= length; i--){
            newarr[i] *= sufix_product;
            sufix_product *= nums[i];
        }
        return newarr;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        int[] result = productExceptSelf(array);
        System.out.println(Arrays.toString(result));
    }
}
