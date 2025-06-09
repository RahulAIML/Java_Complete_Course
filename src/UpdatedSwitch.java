import java.util.Scanner;

public class UpdatedSwitch {
        public static void main(String[] args) {
            
    
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number between 1  to 3");
            int num = input.nextInt();

        String Output = switch(num){
            case 1 -> "Rahul";
            case 2 -> "Rup";
            case 3 -> "Rishi";
            default -> "Please enter the correct number :";
        };
System.out.println(Output);
}
}
