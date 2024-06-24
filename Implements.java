interface Animal{
    public void animalSound();
    public void run();
}

class Dogs implements Animal{
    public void animalSound(){
        System.out.println("Dog Sound : Boo Boo");
    }
    public void run(){
        System.out.println("faster");
    }
}
public class Implements {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.animalSound();
        dog.run();
    }
    
}
