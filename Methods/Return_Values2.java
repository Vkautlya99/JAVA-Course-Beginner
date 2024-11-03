// WAP in java to print the Zip code of your city using User input through Scanner class 

import java.util.Scanner;

public class Return_Values2 {
    
    static int cityZipCode(int Zip) {
        return Zip;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Zip Code : ");

        int Zip = sc.nextInt();
        System.out.println("Your Zip Code is " + Zip + ".");
        
        sc.close();

    }
}
