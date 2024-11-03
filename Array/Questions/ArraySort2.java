
import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        int arr[] = { 7, 3, 4, 1, 8, 2, 9, 6 };
        Arrays.sort(arr, 1, 7);

        for (int i : arr) {
            System.out.print(" " + i);
        }

    }
}
