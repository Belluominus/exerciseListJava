package main.model.services;

import java.time.LocalDate;
import java.util.List;

import main.model.entities.Installment;

public interface PaymentService {

    Double paymentFee(Double amount);
    
    Double interest(Double amount, Integer months);
    
}