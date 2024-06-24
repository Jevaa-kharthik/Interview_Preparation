abstract class Animal {
    public void sleep(){
        System.out.println("Zzz");
    }
}

 class Dogs extends Animal{
    public void animalSound(){
        System.out.println("The Dog sound : Boo Boo");
    }
 }

public class Nothing{
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.animalSound();
        dog.sleep();
    }
 }
