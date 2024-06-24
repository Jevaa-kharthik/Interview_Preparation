class Enums{
    enum level{
        LOW,
        MEDIUM, 
        HIGH
    }
}

public class Solution1 {
    public static void main(String[] args) {
        Enums.level lvl = Enums.level.HIGH;
        switch (lvl) {
            case LOW:
                System.out.println("The Level is Low");
                break;
            case MEDIUM:
                System.out.println("The Level is Medium");
                break;
            case HIGH:
                System.out.println("The Level is High");
                break;
            default:
                break;
        }
    }
    
}
