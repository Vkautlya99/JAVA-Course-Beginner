import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Enter the triming String : ");
        String str = string.nextLine();

        System.out.println(str.toUpperCase().trim());
    }
}
