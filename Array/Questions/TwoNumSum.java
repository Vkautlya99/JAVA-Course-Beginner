
// WAP to print the sum of two numbers ;
import java.util.Scanner;

public class TwoNumSum {
    public static void main(String[] args) {
        // int firstNumber, secondNumber, sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your First Number : ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter Your Second Number : ");
        int secondNumber = sc.nextInt();


        int sum = firstNumber + secondNumber;

        System.out.println("The sum of two given number is = " + sum);
    }
    
}
