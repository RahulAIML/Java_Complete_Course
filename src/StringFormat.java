public class StringFormat {
    public static void main(String[] args) {
        String name = "Rahul";
        System.out.printf("Hello %S You are excellent in coding as you have completed %d questions in CodeChef today" , name , 56);
        System.out.printf("Hello %10s You are excellent in coding as you have completed %0,10d questions in CodeChef today" , name , 56);
        System.out.printf("Hello %-10s You are excellent in coding as you have completed %d questions in CodeChef today" , name , 56);
    }
}
