package main.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate contractDate;
    private Double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, LocalDate contractDate, Double totalValue) {
        this.number = number;
        this.contractDate = contractDate;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getContractDate() {
        return contractDate;
    }

    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }
    
    public void addInstallment(Installment installment) {
        this.installmentList.add(installment);
    }


    
}
