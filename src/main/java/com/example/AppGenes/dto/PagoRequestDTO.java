package com.example.AppGenes.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PagoRequestDTO {
    public String stiPin;
    public String strIdentificador01;
    public String strIdentificador02;
    public String strIdentificador03;
    public Double dblCashAmount;
}
