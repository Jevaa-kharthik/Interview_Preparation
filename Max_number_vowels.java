public class Max_number_vowels {
    public static int Max_Vowels(String s, int k){
        int count = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'i'){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        return count>=k?k:max;
    }

    public static void main(String[] args) {
        int number = Max_Vowels("leetcode", 3);
        System.out.println(number);
    }
    
}
