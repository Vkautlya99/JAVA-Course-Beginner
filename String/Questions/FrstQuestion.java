import java.util.Scanner;

public class FrstQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String fName = sc.nextLine();

        System.out.print("Enter your surname : ");
        String surName = sc.nextLine();

        System.out.println("My Full Name is "+ fName + " "+ surName);

        // (.concat()) is also use to add two strings
        // System.out.println(fName.concat(surName));      
    }
}












