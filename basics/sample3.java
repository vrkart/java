public class sample3 {

    public static String var1 = "10"; // Static variable
    public int var2 = 20; // Instance variable
    private static int var3 = 40; // Private static variable
    private int var4 = 40; // Private instance variable
    int var5 = 50; // Default access variable

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
        sample3 s3 = new sample3();
        System.out.println(var1);
        System.out.println(s3.var2);
        System.out.println(var3); // This will cause an error because var3 is private
        System.out.println(s3.var4); // This will cause an error because var4 is private
        System.out.println(s3.var5);
    }
}