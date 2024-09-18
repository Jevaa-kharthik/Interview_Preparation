import java.util.Scanner;

public class Fuel_Consumption {

    public static double litrePerKilometer(int petrol, int distance){
        if(petrol < 0 && distance < 0){
            return 0;
        }
        return (petrol/distance)*100;
    }

    public static double milesPerGallon(int petrol, int distance){
        if(petrol < 0 && distance < 0){
            return 0;
        }
        double miles = distance * 0.6214;
        double gallon = petrol * 0.2642;

        return (miles/gallon);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of petrol used : ");
        int petrol = sc.nextInt();
        System.out.println("Enter the distance travelled using that petrol : ");
        int distance = sc.nextInt();
        sc.close();
        System.out.println("Litre/100km");
        System.out.println(litrePerKilometer(petrol, distance));
        System.out.println("miles/gallon");
        System.out.println(milesPerGallon(petrol, distance));
        
    }
    
}
