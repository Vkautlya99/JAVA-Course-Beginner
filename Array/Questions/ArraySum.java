public class ArraySum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int num : arr) {
            sum += num;
            // System.out.println(sum);      // This line inside the loop will print all the sum after addition (eg : 1 , 1+2 = 3, 3 + 3 = 6, 6 + 4 = 10, 10 + 5 = 15 )
        }
        System.out.println(sum);
    }   
}
