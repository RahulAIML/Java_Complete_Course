import java.util.Scanner;

public class MoveAllZeroesGFG {
    public static void main(String[] args) {
        System.out.println("Let's Move all the zeroes to the end ");
        int [] arr1 = {12,45,0,5,0,87,0,4};

        @SuppressWarnings({ "unused", "resource" })
        Scanner input = new Scanner(System.in);
        int [] arr2 = new int[arr1.length];

        int [] arr = pushZeroesToEnd(arr1, arr2);
        for (int count = 0; count < arr2.length; count++) {
                
            System.out.println(arr[count]);
        }
    }
    
  public static int[] pushZeroesToEnd(int[] arr1 ,int[] arr2){   
             int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!= 0) {
                    arr2[count++] = arr1[i];
                }
            }
            return arr2;
            
        }
}
