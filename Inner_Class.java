class OuterClass{
    private int x = 10;

    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x = x;
    }

    class InnerClass{
        private int y = 100;

        public int gety(){
            return y;
        }

        public void sety(int y){
            this.y = y;
        }
    }
}

public class Inner_Class {
    
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass in = out.new InnerClass();
        System.out.println(out.getx());
        System.out.println(in.gety());
        out.setx(10);
        in.sety(50);
        System.out.println("The Output changes to : ");
        System.out.println(out.getx());
        System.out.println(in.gety());
    }
}
