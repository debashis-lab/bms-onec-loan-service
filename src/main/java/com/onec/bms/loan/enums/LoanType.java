package com.onec.bms.loan.enums;

public enum LoanType
{
    PERSONAL_LOAN("Personal Loan"),
    HOME_LOAN("Home Loan"),
    AUTO_LOAN("Auto Loan"),
    EDUCATION_LOAN("Education Loan"),
    BUSINESS_LOAN("Business Loan");

    private final String description;

    LoanType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
