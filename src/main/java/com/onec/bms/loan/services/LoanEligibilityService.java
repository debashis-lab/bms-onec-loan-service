package com.onec.bms.loan.services;


public interface LoanEligibilityService {
    //create method to check if a customer is eligible for a loan
    boolean isEligibleForLoan(String customerId, double requestedAmount, String loanType);
    //create method to get the maximum loan amount a customer can apply for
    double getMaxLoanAmount(String customerId, String loanType);
    //create method to get the interest rate for a specific loan type
    double getInterestRate(String loanType);
    //create method to get the loan tenure for a specific loan type
    int getLoanTenure(String loanType);
    //create method to get the loan processing fee for a specific loan type
    double getProcessingFee(String loanType);
    //create method to get the loan eligibility criteria for a specific loan type
    String getEligibilityCriteria(String loanType);


}
