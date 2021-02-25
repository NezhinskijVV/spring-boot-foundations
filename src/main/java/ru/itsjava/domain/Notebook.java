package ru.itsjava.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Notebook {
    private final String brand;

    public Notebook(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
