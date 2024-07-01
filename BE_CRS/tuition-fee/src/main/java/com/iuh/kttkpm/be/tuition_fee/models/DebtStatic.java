package com.iuh.kttkpm.be.tuition_fee.models;

import jakarta.persistence.Entity;


public enum DebtStatic {
    DEBTED,
    PAID;
    private DebtStatic debtStatic;

    DebtStatic getDebtStatic() {
        return debtStatic;
    }
}
