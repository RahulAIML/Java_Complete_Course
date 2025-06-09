import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("My Frame");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}


