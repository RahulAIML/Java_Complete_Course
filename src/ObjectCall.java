public class ObjectCall {
    String Name;


    public static void main(String[] args) {
        ObjectCall obj = new ObjectCall();
        //obj.Name = "Rahul";
       // System.out.println(obj.Name);
        obj.getName("Ram");
        //System.out.println("The name of the student is" + Name);
    }

    public void getName(String Name){
        System.out.println("The name of the student is " + Name);
        
    }
}
