package org.coderzpy.accounts.service.impl;

import org.coderzpy.accounts.dto.CardsDto;
import org.coderzpy.accounts.service.client.CardsFeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;

public class CardsFeignClientImpl implements CardsFeignClient {
    /**
     * @param mobileNumber
     * @return Cards Details
     */
    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
