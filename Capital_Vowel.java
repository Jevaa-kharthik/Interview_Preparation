public class Capital_Vowel {

    public static String capitalVoewl(String sentence){
        char[] array = sentence.toCharArray();
        String result = "";

        for(char letter : array){
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                Character.toUpperCase(letter);
                result += letter;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(capitalVoewl(""));
    }
    
}
