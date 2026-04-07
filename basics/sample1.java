public class sample1 {

//Initializers

    // Static initializer block
    static {
        System.out.println("1. This is printed, when a class is loaded");
    }

    // Instance initializer block
    {
        System.out.println("3. This is printed, when an object is created");
    }

    //Main Method
    public static void main(String[] args) {
        System.out.println("2. This is printed, in the main program");
        sample1 s1 = new sample1();
    }
}
