package com.onec.bms.loan.enums;

public enum LoanStatus

{
    PENDING("Pending"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    DISBURSED("Disbursed"),
    CLOSED("Closed");

    private final String status;

    LoanStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
