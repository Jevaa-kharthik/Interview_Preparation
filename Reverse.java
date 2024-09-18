public class Reverse {

    public static String ReverseWord(String sentence){
        StringBuilder sb = new StringBuilder();

        String[] array = sentence.split(" ");

        for(String word : array){
            String reverse = new StringBuilder(word).reverse().toString();
            sb.append(reverse).append(" ");
        }

        return sb.toString().trim();
    }


    public static void main(String[] args) {

        String name = "KPR is the best college";
        System.out.println(ReverseWord(name));
        
    }
    
}
