import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sumOfTwoNumbers = new Scanner(System.in);
        
        System.out.println("Enter The First Number :");
        int firstNumber = sumOfTwoNumbers.nextInt();

        System.out.println("Enter The Second Number : ");
        int secondNumber = sumOfTwoNumbers.nextInt();
        
        int sum = firstNumber + secondNumber;

        System.out.println("The sum of two numbers is " + sum );
        
        sumOfTwoNumbers.close();
        

    }
}
