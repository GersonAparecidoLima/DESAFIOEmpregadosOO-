package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int payDay;
    private List<Employee> employees;
    private Address address;

    public Department(String name, int payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public double payroll() {
        double totalPayroll = 0.0;
        for (Employee employee : employees) {
            totalPayroll += employee.getSalary();
        }
        return totalPayroll;
    }

    public String getName() {
        return name;
    }

    public int getPayDay() {
        return payDay;
    }

    public Address getAddress() {
        return address;
    }

    // Método para obter a lista de funcionários
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", payDay=" + payDay +
                ", address=" + address +
                '}';
    }
}
