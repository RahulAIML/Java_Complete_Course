import java.util.Scanner;

public class Recursion2 {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number upto which you want to find the fibonacci series  : ");

        int number = input.nextInt();
       for (int i = 0; i < number; i++) {
        System.out.print(fibonacci(i) + " ");
    }

    }

    public static int fibonacci(int number){

      if (number == 0) {
        return 0;
      }
      else if (number == 1 || number == 2) {
        return 1;
      }
      else
       return fibonacci(number-1)+fibonacci(number-2);



    }
}
