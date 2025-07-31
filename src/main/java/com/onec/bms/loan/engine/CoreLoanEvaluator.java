package com.onec.bms.loan.engine;

import com.onec.bms.loan.model.LoanApplicationRequest;

public class CoreLoanEvaluator {
    private final EvaluationRules evaluationRules;

    public CoreLoanEvaluator(EvaluationRules evaluationRules) {
        this.evaluationRules = evaluationRules;
    }

    public boolean evaluateLoanApplication(LoanApplicationRequest request) {
        // Example evaluation logic using the rules
        if (!evaluationRules.evaluateCreditScore(request.getCreditScore())) {
            return false;
        }
        if (!evaluationRules.evaluateDebtToIncomeRatio(request.getDebtToIncomeRatio())) {
            return false;
        }
        if (!evaluationRules.evaluateEmploymentStatus(request.getEmploymentStatus())) {
            return false;
        }
        if (!evaluationRules.evaluateLoanAmount(request.getLoanAmount(), request.getMaxLoanAmount())) {
            return false;
        }
        return true;
    }
}
