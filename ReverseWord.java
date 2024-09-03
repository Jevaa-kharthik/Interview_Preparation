public class ReverseWord {
    public static String Reverse_word(String sentence){
        StringBuilder sb = new StringBuilder();
        String array[] = sentence.split(" ");

        for(String word : array){
            String reverse = new StringBuilder(word).reverse().toString();
            sb.append(reverse).append(" ");
        }
        
        return sb.toString().trim();
    }
    public static String Vowel_Capital(String sentence){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if("aeiou".indexOf(ch) != -1){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(Reverse_word("My name is billa!!!   "));
        System.out.println(Vowel_Capital("my name is jevaa kharthik n"));
        
    }
    
}
