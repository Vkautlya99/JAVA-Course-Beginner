// WAP in java to take the User input day and assign a dress to wear in the same input day 

import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);

        System.out.println("Enter you Day : ");
        int day = days.nextInt();

        if (day == 1 || day == 3) {
            System.out.println("Wear the red dress");
             
        }if (day == 4) {
            System.out.println("Wear the Yellow dress");
        }if (day == 6) {
            System.out.println("Wear the White dress");   
        }else if (day == 7) {
            System.out.println("You can wear any dress by your choice ");
        }

    }
}
