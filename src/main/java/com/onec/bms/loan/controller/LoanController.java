package com.onec.bms.loan.controller;

import com.onec.bms.loan.enums.LoanStatus;
import com.onec.bms.loan.model.Loan;
import com.onec.bms.loan.model.LoanApplicationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loans")

public class LoanController
{


     @PostMapping("/apply")
     public ResponseEntity<Loan> applyForLoan(@RequestBody LoanApplicationRequest request) {
         // Logic to process loan application
         return ResponseEntity.ok(new Loan());
     }

    // Endpoint to get loan status
     @GetMapping("/{loanId}/status")
     public ResponseEntity<LoanStatus> getLoanStatus(@PathVariable String loanId) {
         // Logic to retrieve loan status

         return ResponseEntity.ok(LoanStatus.PENDING);
     }

    // Additional endpoints can be added here
}
