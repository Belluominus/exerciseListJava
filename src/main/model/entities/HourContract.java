package main.model.entities;
import java.time.LocalDate;

public class HourContract  {
    private LocalDate date;
    private Double veluePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.veluePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getVeluePerHour() {
        return veluePerHour;
    }

    public void setVeluePerHour(Double veluePerHour) {
        this.veluePerHour = veluePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue() {
        return this.veluePerHour * this.hours;
    }
    
}
