package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.Employee;
import entities.Address;

public class Program {
    public static void main(String[] args) {
    	Locale.setDefault(Locale.US); // Define o local para o formato dos números
        Scanner scanner = new Scanner(System.in);
        
        // Coletando informações do departamento
        System.out.print("Nome do departamento: ");
        String departmentName = scanner.nextLine();
        
        System.out.print("Dia do pagamento: ");
        int payDay = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Telefone: ");
        String phone = scanner.nextLine();
        
        // Criando o endereço
        Address address = new Address(email, phone);
        
        // Criando o departamento
        Department department = new Department(departmentName, payDay, address);
        
        // Coletando informações dos funcionários
        System.out.print("Quantos funcionários tem o departamento? ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");
            System.out.print("Nome: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("Salário: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha
            
            // Criando o funcionário e adicionando ao departamento
            Employee employee = new Employee(employeeName, salary);
            department.addEmployee(employee);
        }
        
     // Gerando o relatório de folha de pagamento
        System.out.println("\nFOLHA DE PAGAMENTO:");
        System.out.printf("Departamento " + department.getName()+" = R$ %.2f\n", department.payroll());
        System.out.println("Pagamento realizado no dia " + payDay);
        System.out.println("Funcionários:");

        for (Employee emp : department.getEmployees()) { // Usando o método getter
            System.out.println( emp.getName());
        }

        System.out.println("Para dúvidas, favor entrar em contato: " + address.getEmail());
        
        
        scanner.close(); // Fechando o scanner
    }
}
