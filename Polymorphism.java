class Animal{
    public void sound(){
        System.out.println("The Animal make the sound");
    }
}

class pig extends Animal{
    public void sound(String nothing){
        System.out.println("The pigs make the sound like " + nothing);
    }
}

class dogs extends Animal{
    public void sound(String nothing){
        System.out.println("The Dogs make sound like" + nothing);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        pig pig_sound = new pig();
        pig_sound.sound("Ouchhhh");
        dogs dog_sound = new dogs();
        dog_sound.sound("barkkkkk");
    }
    
}
