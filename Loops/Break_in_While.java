

public class Break_in_While {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
            if(i == 3) break;
        }
    }
}
