import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args) {
       //boolean great = 4>5 ? true : false;
       //System.out.println(great);

       @SuppressWarnings("resource")
    Scanner intput = new Scanner(System.in);
    System.out.println("Please enter the value of a ");
    int a = intput.nextInt();
    System.out.println("Please enter the value of b ");
       int b = intput.nextInt();

       int large = a>b ? a : b ;
       System.out.println("Larger number is "+ large);
       System.out.println(Math.max(a, b));
       System.out.println(Math.min(a, b));
    }
}
