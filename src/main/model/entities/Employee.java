package main.model.entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String toString() {
        return name 
            + ", $ "
            + String.format("%.2f", this.netSalary());
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary = grossSalary + (grossSalary / percentage);
    }
}
