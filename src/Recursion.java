import java.util.Scanner;
public class Recursion {
    public static void main (String[] args){   
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find out the factorial  : ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("The factorial of the given number is   : " + fact );

}

public static long factorial(int num){
    if (num == 1 || num == 0) {
        return 1;
    }
    return num * factorial(num-1);
}
}