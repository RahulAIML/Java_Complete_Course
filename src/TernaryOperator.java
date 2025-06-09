import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Welcome to number checker : \n");
        System.out.println("Please enter the first number : ");
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Please enter the second number : ");
        int num2 = input.nextInt();


        int greaterNum = num1>num2 ? num1 : num2;
        System.out.println(greaterNum + " is the greater number ");
    }
}
