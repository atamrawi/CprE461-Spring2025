package mypackage;

public class AccessExample {
    private int privateVar = 1;         // Accessible only within this class
    int defaultVar = 2;                 // Accessible within the same package (package-private)
    protected int protectedVar = 3;     // Accessible within the same package and subclasses
    public int publicVar = 4;           // Accessible from anywhere

    public void display() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}
