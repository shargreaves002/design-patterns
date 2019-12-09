package structural.composite;

import java.math.BigDecimal;

public abstract class Employee {
    protected String name;
    protected BigDecimal salary;

    protected Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getSalary(){
        return this.salary;
    }

    public void setSalary(BigDecimal salary){
        this.salary = salary;
    }
}
