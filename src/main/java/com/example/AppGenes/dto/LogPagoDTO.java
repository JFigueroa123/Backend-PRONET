package com.example.AppGenes.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class LogPagoDTO {
    private String pingRef;
    private String id01;
    private String id02;
    private String id03;
    private LocalDate fecha;
}
