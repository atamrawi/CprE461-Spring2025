package anotherpackage;
import mypackage.AccessExample;

public class SubclassTest extends AccessExample {
    public static void main(String[] args) {
        SubclassTest obj = new SubclassTest();
        
        // System.out.println(obj.privateVar);  // ❌ Not accessible (private)
        // System.out.println(obj.defaultVar);  // ❌ Not accessible (default)
        System.out.println(obj.protectedVar); // ✅ Accessible (protected) through inheritance
        System.out.println(obj.publicVar);    // ✅ Accessible (public)
    }
}
