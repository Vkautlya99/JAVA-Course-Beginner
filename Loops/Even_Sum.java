// WAP to print the sum of even numbers 
import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <=5 ; i++){
            sum = sum + 2*i;
        }
        System.out.println(sum);
    }
}
