package structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Organization {
    public ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public BigDecimal getNetSalaries(){
        BigDecimal salary = BigDecimal.ZERO;
        for (Employee e : employees) {
            salary = salary.add(e.getSalary());
        }
        return salary;
    }
}
