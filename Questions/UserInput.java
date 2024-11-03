import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name Here : ");
        String name = scanner.nextLine();

        System.out.println("Enter Your Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter your favourite color : ");
        String color = scanner.nextLine();


        System.out.println("Hello " + name);
        System.out.println("You are of " + age + " years");
        System.out.println("Your favorite color is " + color);

        scanner.close();

    }
}