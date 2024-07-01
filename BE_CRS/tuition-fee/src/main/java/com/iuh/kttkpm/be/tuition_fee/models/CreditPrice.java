package com.iuh.kttkpm.be.tuition_fee.models;

public enum CreditPrice {
    PRACTICE(50000),
    THEORY(30000);

    private final int price;

    CreditPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
