import java.util.Scanner;

public class sample4 {

    public static void main (String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = s1.nextInt();
        System.out.println("Enter another number: ");
        int num2 = s1.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
