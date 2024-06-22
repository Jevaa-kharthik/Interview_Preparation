public class Triplet_sequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int num : nums){
            if(num <= first){
                first = num;
            }
            else if(num <= second){
                second = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
