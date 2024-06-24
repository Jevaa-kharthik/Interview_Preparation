class Animal{
    public void sound(){
        System.out.println("The Animal make the sound");
    }
}

class pig extends Animal{
    public void sound(){
        System.out.println("The pigs make the sound like ");
    }
}

class dogs extends Animal{
    public void sound(){
        System.out.println("The Dogs make sound like");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        pig pig_sound = new pig();
        pig_sound.sound();
    }
    
}
