public class Reversed_string{
    public static void main(String[] args){
        String str1 = new String("Jevaa Kharthik");
        String reverseString = "";
        for(int i=0;i<str1.length(); i++){
            reverseString = str1.charAt(i) + reverseString;
        }
        System.out.println(reverseString);
}
}