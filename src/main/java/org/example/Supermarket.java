package org.example;

import java.util.*;

public class Supermarket implements Cloneable {
    private String nazva;
    private Map<String, Double> tovari;

    public Supermarket(String nazva) {
        this.nazva = nazva;
        this.tovari = new HashMap<>();
    }

    public static double minPrice(String tovar, Collection<Supermarket> markets) {
        double min = Double.MAX_VALUE;
        boolean found = false;

        for (Supermarket market : markets) {
            Double cina = market.getTovari().get(tovar);
            if (cina != null) {
                min = Math.min(min, cina);
                found = true;
            }
        }

        return found ? min : 0.0;
    }

    public void add(String tovar, double cina) {
        tovari.put(tovar, cina);
    }

    public void remove(String tovar) {
        tovari.remove(tovar);
    }

    public String getNazva() {
        return nazva;
    }

    public Map<String, Double> getTovari() {
        return tovari;
    }

    @Override
    public Supermarket clone() {
        try {
            Supermarket cloned = (Supermarket) super.clone();
            cloned.tovari = new HashMap<>(tovari);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

