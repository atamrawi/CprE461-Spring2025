
// Person class implementing Cloneable for shallow copy
class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy using clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy method: creates a new Person and new Address instance
    public Person deepCopy() {
        return new Person(this.name, new Address(this.address));
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address='" + address.street + "'}";
    }

    public static class Address {
        String street;
    
        Address(String street) {
            this.street = street;
        }
    
        // Copy constructor for deep copy
        Address(Address another) {
            this.street = another.street;
        }
        
           public static void main(String[] args) throws CloneNotSupportedException {
            // Create a Person with an Address
            Address address = new Address("123 Main St");
            Person person1 = new Person("Alice", address);
    
            // Shallow copy of person1
            Person person2 = (Person) person1.clone();
    
            // Deep copy of person1
            Person person3 = person1.deepCopy();
    
            // Modify the address in the original object
            person1.address.street = "456 Oak St";
    
            // Output shows:
            // - Shallow copy reflects the change (shares the same Address instance)
            // - Deep copy retains the original address value
            System.out.println("Original: " + person1);
            System.out.println("Shallow copy: " + person2);
            System.out.println("Deep copy: " + person3);
        }
    }
}

