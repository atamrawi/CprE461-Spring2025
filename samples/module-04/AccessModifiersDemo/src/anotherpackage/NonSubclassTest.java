package anotherpackage;
import mypackage.AccessExample;

public class NonSubclassTest {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        // System.out.println(obj.privateVar);  // ❌ Not accessible (private)
        // System.out.println(obj.defaultVar);  // ❌ Not accessible (default)
        // System.out.println(obj.protectedVar); // ❌ Not accessible (protected)
        System.out.println(obj.publicVar);    // ✅ Accessible (public)
    }
}
