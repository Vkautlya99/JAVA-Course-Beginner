import java.util.Scanner;

public class IF_ELSE_ELSE_IF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number below : ");
        int age = sc.nextInt();

        if (age <= 17) {
            System.out.println("You will vote in next election ");
        }else if (age >= 18){
            System.out.println("You are ready to vote in this election ");
        }else{
            System.out.println("You can't vote");
        }
            
        }

    }




