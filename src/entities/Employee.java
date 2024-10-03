package entities;

public class Employee {
    // Atributos privados
    private String name;
    private double salary;

    // Construtor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método getter para o nome
    public String getName() {
        return name;
    }

    // Método setter para o nome
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para o salário
    public double getSalary() {
        return salary;
    }

    // Método setter para o salário
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Método toString para representação da classe
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
