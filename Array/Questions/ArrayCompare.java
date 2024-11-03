
import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

        System.out.println("Array1 and Array2 is equal or not : "+ Arrays.compare(arr1, arr2));
        System.out.println("Array1 and Array2 is equal or not : "+ Arrays.compare(arr1, arr3));
        System.out.println("Array1 and Array2 is equal or not : "+ Arrays.compare(arr3, arr2));

    }
    
}
