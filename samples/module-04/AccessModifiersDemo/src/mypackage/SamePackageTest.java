package mypackage;

public class SamePackageTest {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        
        // System.out.println(obj.privateVar);  // ❌ Not accessible (private)
        System.out.println(obj.defaultVar);   // ✅ Accessible (default)
        System.out.println(obj.protectedVar); // ✅ Accessible (protected)
        System.out.println(obj.publicVar);    // ✅ Accessible (public)
    }
}
