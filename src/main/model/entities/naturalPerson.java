package main.model.entities;

public class naturalPerson extends Taxpayers {
    private Double healthSpending;

    public naturalPerson() {
    }

    public naturalPerson(String name, Double anualIncome, Double healthSpending) {
        super(name, anualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public double getTax() {
        if(getAnualIncome() >= 20000) {
            double tax =  getAnualIncome() * 0.25;
            double helthCut = healthSpending / 2;

            return tax - helthCut;
        } else {
            double tax =  getAnualIncome() * 0.15;
            double helthCut = healthSpending / 2;

            return tax - helthCut;
        }
    }

    
}
