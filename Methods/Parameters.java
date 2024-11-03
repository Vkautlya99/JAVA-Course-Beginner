// Information can be passed to methods as a parameter. Parameters act as variables inside the method.

// Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

public class Parameters {

    static void getName(String firstName) {
        System.out.println(firstName + " Kautlya");
    }

    static String myName(String realName) {
        return realName;
    }

    public static void main(String[] args) {
        getName("Vikram");
        System.out.println(myName("Vikram Kautlya"));
          
    }
    
}
