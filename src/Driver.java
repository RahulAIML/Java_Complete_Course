public class Driver {
    String Name;
    public String getString(String Name){
        return Name;
    }
    public static void main(String[] args) {
     Car myCar = new Car("black"); //MyCar is reference name acts as Personal Assistant
     myCar.addFuel(6);
     myCar.start().drive();
     myCar.drive();
     myCar.addFuel(2);  
     myCar.drive();
     System.out.println(myCar.getCurrentFuelInLitres());
     myCar.getColor();


     Driver myDriver = new Driver();
     System.out.println(myDriver.getString("Virat"));
     

    }
}
