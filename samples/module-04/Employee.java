// Define the Employee class
public class Employee {
    
    // Private member variables (Encapsulation)
    private String fullName;
    private String address;
    private String workPhone;
    private String homePhone;
    private String taxIdNumber;
    private JobClassification jobClass; // Assume JobClassification is an Enum or Class
    
    // Default Constructor
    public Employee() {
        // Default values can be initialized here if needed
    }

    // Parameterized Constructor
    public Employee(String fullName, String address, String workPhone, String homePhone, 
                    String taxIdNumber, JobClassification jobClass) {
        this.fullName = fullName;
        this.address = address;
        this.workPhone = workPhone;
        this.homePhone = homePhone;
        this.taxIdNumber = taxIdNumber;
        this.jobClass = jobClass;
    }

    // Public Getter Methods
    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public JobClassification getJobClassification() {
        return jobClass;
    }

    // Override toString() for easy debugging and printing
    @Override
    public String toString() {
        return "Employee [Full Name=" + fullName + ", Address=" + address + 
               ", Work Phone=" + workPhone + ", Home Phone=" + homePhone +
               ", Tax ID=" + taxIdNumber + ", Job Classification=" + jobClass + "]";
    }
}
