public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5 || i >= 3)
                continue;
            System.out.println("Give toffee to : "+ i);
        }
    }
}
