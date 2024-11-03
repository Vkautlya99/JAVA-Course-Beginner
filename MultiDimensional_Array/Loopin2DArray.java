

public class Loopin2DArray {
    public static void main(String[] args) {
        int Marks[][] = {
                { 90, 90, 90 },
                { 91, 91, 91 },
                { 92, 92, 92 }
                            
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Marks[i][j] + " ");
            }
            System.out.println();
        }



    }
}
