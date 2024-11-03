public class String_Comparison {
    public static void main(String[] args) {
        String name = "Vikram";
        String name2 = "Vikram";
        
        String str = new String("Vikram");

        if (name == name2) {
            System.out.println("Both name & name2 String is Equal.");
        } else {
            System.out.println("Both String name and name2 is not equal");
        }


        if (name == str) {
            System.out.println("Both name and str is equal.");
        } else {
            System.out.println("name and str is not equal.");
        }


        if (name2 == str) {
            System.out.println("name2 and str is equal.");
        } else {
            System.out.println("name2 and str is not equal.");
        }

    }
}
