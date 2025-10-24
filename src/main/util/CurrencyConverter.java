package main.util;

public class CurrencyConverter {
    public static double dollarPrice = 3.10;
    public static double iOF = 0.06;

    public static double paidAmount(double quanttitie) {
        double aux = quanttitie * dollarPrice;

        return aux + (aux * iOF);
    }
}
