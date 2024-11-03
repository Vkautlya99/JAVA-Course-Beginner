
import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        String str1[] = { "Vikram", "Shayan", "Kritika", "Pawan" };
        String str2[] = { "Vikram", "Shayan", "Kritika", "Pawan" };
        String str3[] = { "Vikram", "Shayan", "Kritika", "Pawan" , "Aarti"};

        System.out.println(Arrays.equals(str1, str2));
        System.out.println(Arrays.equals(str1, str3));
    }
}
