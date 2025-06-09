public class Car {
//Those the the properties of the object
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelLevelInLitres;
    int noOfSeats;
    int price;

 // Parametrized Constructor
    Car(String color){
        this.color = color;
        price = 2003233;
    }
    public Car start(){
        System.out.println("Start the Car");
        return this;
    }
    public void drive(){
        if (currentFuelLevelInLitres==0) {
          System.out.println("The car is out of fuel");  
        }
        else if (currentFuelLevelInLitres<5) {
            System.out.println("Your car is in reserve mode");
        }
        else
        {
            System.out.println("The car is driving ");
        currentFuelLevelInLitres-- ;
    }
    }


    public void addFuel(float fuel){
currentFuelLevelInLitres += fuel ;
    }

    public float getCurrentFuelInLitres (){
        return currentFuelLevelInLitres;
    }

public void getColor(){
    System.out.println("The color of the Car is " + color);
}
@SuppressWarnings("removal")
@Override
protected void finalize() throws Throwable {
   System.out.println("I am inside the Finalize method");
    super.finalize();
}

}
