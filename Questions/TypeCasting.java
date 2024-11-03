import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner typecasting = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        int firstNum = typecasting.nextInt();

        System.out.println("Enter your second number : ");
        float secondNum = typecasting.nextFloat();

        float sum = (float)(firstNum + secondNum);

        System.out.println(sum);


        typecasting.close();

       

    }   
}
