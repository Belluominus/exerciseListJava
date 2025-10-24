package main.model.entities;

public class OutsourceEmployee extends CompanyEmployee {
    private Double additionalCharge;

    public OutsourceEmployee() {
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public final Double payment(){
        double totalPayment = this.getValuePerHour() * this.getHours();

        double charge = (additionalCharge * 0.10) + additionalCharge;

        return totalPayment + charge;
    }
}   
