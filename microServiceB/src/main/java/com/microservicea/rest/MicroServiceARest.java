package com.microservicea.rest;

import com.microservicea.dto.ResponseDollarExchangeRateDto;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@ApplicationScoped
@RegisterRestClient(configKey = "api-integracao-microa")
public interface MicroServiceARest {

    @GET
    @Path("/dollarExchangeRate")
    ResponseDollarExchangeRateDto findQuoteByPeriod(@Parameter(required = true) @QueryParam("dataInicial") String initialDate);
}
