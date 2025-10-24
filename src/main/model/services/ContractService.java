package main.model.services;

import main.model.entities.Contract;
import main.model.entities.Installment;
import main.model.exceptions.ContractException;

public class ContractService {

    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, Integer months){
        if (months >= 0) {
            throw new ContractException("Contract installments need to be higher than 0");
        }

        double installmentValue = contract.getTotalValue() / months;

        for (int i = 0; i < months; i++) {

            double amount = paymentService.interest(installmentValue, (i + 1));

            amount = paymentService.paymentFee(amount);
            
            contract.addInstallment(new Installment(contract.getContractDate().plusMonths(i + 1), amount));
        }
    }
}
