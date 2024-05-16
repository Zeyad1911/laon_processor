package org.example;

public class LoanProcessor {
    public String processLoanApplication(int creditScore, boolean isEmployed, double loanAmount) {
        if (creditScore < 600) {
            return "Rejected: Credit score too low";
        } else if (!isEmployed) {
            return "Rejected: Applicant must be employed";
        } else if (loanAmount > 50000) {
            return "Rejected: Loan amount too high";
        } else {

            return "Approved";
        }
    }

}
