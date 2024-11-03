// For-each loop in java :
// Syntax :
                             // for(int/string arr_name/str_name : declared/initialized string/array);


public class Foreachloop {
    public static void main(String[] args) {
        int age[] = { 22, 33, 44, 18, 32, 33 };
        for (int eachage : age) {
            System.out.println(eachage);
        }

        
        String names[] = { "Vikram", "Laxita", "Sanjana", "Reyan" };
        for (String name : names) {
            System.out.println(name);
        }
    
    }
}
