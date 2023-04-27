package org.example;

import java.util.*;

public class Main {
    private static final Supermarket ATB = new Supermarket("Atb");
    private static final Supermarket SILPO = new Supermarket("Siplo");
    private static final Supermarket GROSH = new Supermarket("Grosh");

    public static void main(String[] args) {
        ATB.add("ручка", 10.0);
        ATB.add("папір", 20.0);
        ATB.add("гумка", 30.0);

        SILPO.add("ручка", 15.0);
        SILPO.add("весло", 25.0);

        GROSH.add("ручка", 12.0);
        GROSH.add("папір", 35.0);
        GROSH.add("гумка", 45.0);

        // при передачі ручка1, повинні отримати 0
        System.out.println("Мінімальна ціна товару ручка1 = " + Supermarket.minPrice("ручка1", List.of(ATB, SILPO, GROSH)));

        // повинні отримати 10
        System.out.println("Мінімальна ціна товару ручка = " + Supermarket.minPrice("ручка", List.of(ATB, SILPO, GROSH)));


        // метод minprice знаходиться в Supermarket
        // vsiTovaru не реалізував, не зрозумів тз
    }
}