/*import static java.lang.StringTemplate.STR;

//import java.lang.String;
public static class Car1 {
    //instance variables
    int noOfWheels;
    float maxSpeed;
    String color;
    float currentFuelLevelInLitres;
    int noOfSeats;

    // instance methods
    public Car start(){
        if (currentFuelLevelInLitres == 0) {
            System.out.println("The car is out of fuel , you can not drive the car ");
        } else if (currentFuelLevelInLitres <= 5) {
            System.out.println("The car is in reserved mode , please refuel");
        } else {
            System.out.println("The car is driving .....bruhhhhh");
            currentFuelLevelInLitres--;
        }
        return this;
    }
    public void drive() {
       /* if (currentFuelLevelInLitres == 0) {
            System.out.println("The car is out of fuel , you can not drive the car ");
        } else if (currentFuelLevelInLitres <= 5) {
            System.out.println("The car is in reserved mode , please refuel");
        } else {
 /*           System.out.println("The car is driving .....bruhhhhh");
            currentFuelLevelInLitres--;
        }
    }
    public void addFuel(float Fuel){
        currentFuelLevelInLitres+= Fuel;

    }
    public float CurrentFuelLevel(){

        return currentFuelLevelInLitres;
    }

    public String getColor(String color) {

        return color;
    }
    public int getNoOfWheels(int noOfWheels){

        return noOfWheels;
    }
    public float getMaxSpeed(float maxSpeed){

        return maxSpeed;
    }
}
*/
    /*    public static void main(String[] args) {
            //object creation using new
            Car myCar = new Car();
            // String color = myCar.getColor();
            myCar.drive();
            System.out.println("The current fuel level is " + myCar.CurrentFuelLevel() + "L");
            myCar.addFuel(5);
            myCar.addFuel(2);
            System.out.println("The current fuel level is " + myCar.CurrentFuelLevel() + "L");
            myCar.drive();
            myCar.drive();
            System.out.println("The current fuel level is " + myCar.CurrentFuelLevel() + "L");
            myCar.drive();
            System.out.println(myCar.getNoOfWheels(4) + " Wheelers");
            System.out.println(myCar.getMaxSpeed(245.0f)+" km per hour");
            System.out.println("The car is " + myCar.getColor("Black") + " in color");

            Car Alto = new Car();
            Alto.addFuel(2);
            Car startedCar = Alto.start();
            startedCar.drive();
        }

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find its factorial: ");
        int num = input.nextInt();
        input.close(); // Close the scanner to prevent resource leak

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(num);
            System.out.println("The factorial of " + num + " is: " + fact);
        }
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}

*/