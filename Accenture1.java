public class Accenture1 {
    public static boolean func(int number){
        if(number == 2 ){
            return true;
        }
        if(number %2 == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(number); i+=2){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int addition(int sum){
        int total = 0;
        for(int i = 2; i < sum; i++){
            if(func(i)){
                total += i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(addition(10));
        System.out.println(addition(30));
        
    }
    
}

