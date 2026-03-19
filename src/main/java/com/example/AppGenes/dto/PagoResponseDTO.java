package com.example.AppGenes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PagoResponseDTO {
    private String strResponseCode;
    private String strResponseMessage;
    private String strAutorizationCode;
    private Double dblCashAmount;
    private Double dblCommissionFee;
    private String strName;
}





