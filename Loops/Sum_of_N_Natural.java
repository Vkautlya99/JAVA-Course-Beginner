// WAP to print the sum of N natural numbers
import java.util.Scanner;

public class Sum_of_N_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");

        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            // System.out.println(sum);      
        }
        System.out.println(sum);
    }
}
