package structural.composite;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("John", new BigDecimal("50000.00"));
        Designer designer = new Designer("Jane", new BigDecimal("75000.00"));

        Organization organization = new Organization();
        organization.addEmployee(developer);
        organization.addEmployee(designer);
        System.out.println(organization.getNetSalaries());
    }
}
