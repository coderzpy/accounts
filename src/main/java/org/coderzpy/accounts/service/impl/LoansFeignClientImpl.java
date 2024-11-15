package org.coderzpy.accounts.service.impl;

import org.coderzpy.accounts.dto.LoansDto;
import org.coderzpy.accounts.service.client.LoansFeignClient;
import org.springframework.http.ResponseEntity;

public class LoansFeignClientImpl implements LoansFeignClient {
    /**
     * @param mobileNumber
     * @return Loan Details
     */
    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
