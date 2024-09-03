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
    public static void main(String[] args) {
        System.out.println(Reverse_word("My name is billa!!!   "));
        
    }
    
}
