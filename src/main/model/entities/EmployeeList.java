package main.model.entities;

import java.util.UUID;

public class EmployeeList {
    private UUID id;
    private String name;
    private Double salary;

    public EmployeeList(String name, Double salary) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.salary = salary;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }
    
    public void salaryIncreaseByPercentage(double percentage) {
        this.salary += (salary * percentage) / 100;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
