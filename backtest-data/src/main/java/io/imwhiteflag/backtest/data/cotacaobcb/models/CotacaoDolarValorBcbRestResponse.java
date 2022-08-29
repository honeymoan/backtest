package io.imwhiteflag.backtest.data.cotacaobcb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CotacaoDolarValorBcbRestResponse {
    BigDecimal cotacaoCompra;
    BigDecimal cotacaoVenda;
    String dataHoraCotacao;
}
