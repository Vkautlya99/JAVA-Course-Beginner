public class LowestElement {
    public static void main(String[] args) {
        int Ages[] = { 20, 33, 45, 21, 98, 56, 18 };
        
        int lowestAge = Ages[0];

        for (int age : Ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println(lowestAge);
    }
    
}
