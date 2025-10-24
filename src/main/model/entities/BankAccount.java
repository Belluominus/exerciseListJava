package main.model.entities;

public class BankAccount {

    private static final double tax = 5.00;

    private Integer accountNumber;
    private String titularName;
    private Double accountBalance;


    public BankAccount(int accountNumber, String titularName){
        this.accountNumber = accountNumber;
        this.titularName = titularName;
    }

    public BankAccount(int accountNumber, String titularName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.titularName = titularName;
        this.deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double deposit) {
        this.accountBalance += deposit;
    } 

    public void withdraw(double withdraw) {
        this.accountBalance -= (withdraw + tax);
    } 

    public String toString(){
        return "Account "
            + this.accountNumber
            + ", Holder: "
            + this.titularName
            + ", Balance: $ "
            + String.format("%.2f", this.accountBalance);
    }
    
}
