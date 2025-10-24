package main.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = LocalDate.parse(manufactureDate, formatter);
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + manufactureDate.format(formatter) + ")";
    }
}
