import java.util.Scanner;

public class Class_Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Email:");
        String email = sc.nextLine();
        System.out.println("Enter the Type:");
        String type = sc.nextLine();
        System.out.println("Enter the Country:");
        String country = sc.nextLine();
        sc.close();
        Main1 obj = new Main1(name, email, type, country);
        System.out.println("The Customer Details : ");
        System.out.println(obj.getName() + "\n" + obj.getEmail() + "\n" + obj.getType() + "\n" + obj.getCountry());
    }
}
