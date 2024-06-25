abstract class Animal{
    abstract void Sound();
}

class Dogs extends Animal{
    public void Sound(){
        System.out.println("meow");
    }
}



public class Abstract_nothing {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.Sound();
    }
}
