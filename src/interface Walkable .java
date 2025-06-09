interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}

class Dog implements Walkable, Runnable {
    public void walk() {
        System.out.println("Dog walks");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}
