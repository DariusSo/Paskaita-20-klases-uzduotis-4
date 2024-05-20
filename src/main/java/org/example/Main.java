package org.example;

import java.math.BigDecimal;
import java.util.Random;

public class Main {
    public static String[] vardai = {"Darius", "Mantas", "Benas", "Lukas", "Tomas", "Giedrius", "Rimas", "Vilius"};
    public static String[] pavardes = {"Malasauskas", "Kazlauskas", "Kleiza", "Kondrotas", "Kontrimas", "Paskevicius", "Nauseda", "Vaitkus"};

    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 8; i++){
            Darbuotojas darb = new Darbuotojas(vardai[random.nextInt(0,8)], pavardes[random.nextInt(0,8)], Darbuotojas.alga());
            System.out.println("Vardas Pavarde: " + darb.vardas + " " + darb.pavarde + " | Alga: " + darb.atlyginimas + " | Alga po 15 % pakilimo: " + darb.padidintaAlga(darb.atlyginimas));
        }
    }

}