import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner input  = new Scanner(System.in);
        int [] arr = {11,21,545};
 
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
