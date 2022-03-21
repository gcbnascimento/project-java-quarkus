package com.microservicea.service.impl;

import com.microservicea.dto.ResponseDollarExchangeRateDto;
import com.microservicea.exception.BusinessException;
import com.microservicea.rest.MicroServiceARest;
import com.microservicea.service.DollarExchangeRateService;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DollarExchangeRateServiceImpl implements DollarExchangeRateService {

    @Inject
    @RestClient
    MicroServiceARest olindaServiceRest;

    @Override
    public ResponseDollarExchangeRateDto findQuoteByPeriod(String initialDate) throws BusinessException {
        return olindaServiceRest.findQuoteByPeriod(initialDate);
    }
}
