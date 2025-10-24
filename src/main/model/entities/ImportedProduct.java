package main.model.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + "(Customs fee: $ "+ String.format("%.2f", customsFee) +")";
    }

    
}
