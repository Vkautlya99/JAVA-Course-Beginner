// Write a program in JAVA to find the greatest number between three numbers 

public class Nested_If_else {
    public static void main(String[] args) {
        int a = 14;
        int b = 8;
        int c = 2;

        if (a > b) {
            System.out.println("a is greater than b. ");
            if (a > c) {
                System.out.println("a is the greater than c. ");
                System.out.println("Value of a = "+ a);
            } else {
                System.out.println("b is the greater than a. ");
                System.out.println("c is greatest = "+ c);
            }
        }else {
            System.out.println("b is greater than a.");
            if (b > c) {
                System.out.println("b is greater than c. ");
                System.out.println("b is the greatest = " + b);
            } else {
                System.out.println("c is greater than b.");
                System.out.println("c is greatest = " + c);
            }
        }

    }
}
