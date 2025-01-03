import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee{
    //this is our composite
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp: employeeList){
            emp.showEmployeeDetails();
        }
    }
    //normally you will have add employee and remove employee in the interface but this violates some principles so yeah.
    // in this case(not including them in the interface)you can't treat them(composite and leaf) transparently
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }
}
