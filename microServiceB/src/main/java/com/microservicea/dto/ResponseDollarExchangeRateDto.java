package com.microservicea.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Conjunto de informações referentes a contação do Dollar")
public class ResponseDollarExchangeRateDto {
    private List<ExchangeRateValues> value;

    @Getter
    @AllArgsConstructor
    private static class ExchangeRateValues{
        @JsonProperty("cotacaoCompra")
        private BigDecimal purchaseQuote;
        @JsonProperty("cotacaoVenda")
        private BigDecimal saleQuote;
        @JsonProperty("dataHoraCotacao")
        private String dataTimeQuote;
    }
}
