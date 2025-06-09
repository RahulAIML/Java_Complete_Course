import java.util.Scanner;

public class SwitchCalculator {
        public static void main(String[] args) {
            
    
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number between 1  to 3");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

        int  Output = switch(num1){
            case 1 -> num2*num3;
            case 2 -> num2+num3;
            case 3 -> num2-num3;
    
            default -> -1;
        };
System.out.println(Output);
}
}
