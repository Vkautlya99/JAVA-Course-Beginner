import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        System.out.println(num);

        

        
        Scanner mystring = new Scanner(System.in);
        String string = mystring.nextLine();
        System.out.println(string);

        mystring.close();

    }
    
}
