package com.onec.bms.loan.engine;

public class EvaluationRules {

    public boolean evaluateCreditScore(int creditScore) {
        return creditScore >= 700;
    }

    public boolean evaluateDebtToIncomeRatio(double dti) {
        return dti < 0.4;
    }

    public boolean evaluateEmploymentStatus(String employmentStatus) {
        return "EMPLOYED".equalsIgnoreCase(employmentStatus);
    }

    public boolean evaluateLoanAmount(double loanAmount, double maxLoanAmount) {
        return loanAmount <= maxLoanAmount;
    }
}
