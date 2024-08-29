public class Char_Playing {

    public static String change_Char(String name, char ch1, char ch2){
        char letters[] = name.toCharArray();
        for(int i = 0; i < name.length(); i++){
            if(letters[i] == ch1){
                letters[i] = ch2;
            }
            else if(letters[i] == ch2){
                letters[i] = ch1;
            }
        }
        return new String(letters);
    }
    public static void main(String[] args) {
        System.out.println(change_Char("apples", 'a', 'p'));
    }
    
}
