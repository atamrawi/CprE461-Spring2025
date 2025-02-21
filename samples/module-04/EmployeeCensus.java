import java.util.ArrayList;
import your.package.name.Employee; // replace with the actual package name

public class EmployeeCensus extends ArrayList<Employee> {
    
    public void addEmployee(Employee employee) {
        this.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.remove(employee);
    }

    Employee nextItemInList();

    Employee firstItem();

    Employee lastItem();
}