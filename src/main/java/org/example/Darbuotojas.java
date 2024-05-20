package org.example;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class Darbuotojas {
    public String vardas;
    public String pavarde;
    public BigDecimal atlyginimas;

    public Darbuotojas(String vardas, String pavarde, BigDecimal atlyginimas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.atlyginimas = atlyginimas;
    }

    public BigDecimal padidintaAlga(BigDecimal atlyginimas1){
        BigDecimal priedas = new BigDecimal("1.15");
        BigDecimal atlyginimas15 = atlyginimas1.multiply(priedas);
        return atlyginimas15.setScale(2, RoundingMode.HALF_UP);
    }
    public static BigDecimal alga(){
        Random random = new Random();
        BigDecimal big = new BigDecimal(random.nextDouble(1000.00, 2000.00));
        return big.setScale(2, RoundingMode.HALF_UP);
    }
}
