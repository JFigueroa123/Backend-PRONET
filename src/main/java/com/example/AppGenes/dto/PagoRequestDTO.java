package com.example.AppGenes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PagoRequestDTO {
    private String stiPin;
    private String strIdentificador01;
    private String strIdentificador02;
    private String strIdentificador03;
    private Double dblCashAmount;
}
