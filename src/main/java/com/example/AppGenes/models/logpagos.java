package com.example.AppGenes.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "logpagos")
@Getter @Setter
public class logpagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String pingRef;
    private String id01;
    private String id02;
    private String id03;
    private LocalDate fecha;
    public Double monto;
}
