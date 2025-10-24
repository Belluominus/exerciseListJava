package main.model.entities;

public class LegalEntity extends Taxpayers {
    private Integer employees;

    public LegalEntity() {
    }

    public LegalEntity(String name, Double anualIncome, Integer employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public double getTax() {
        if(employees > 10){
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }

    
}
