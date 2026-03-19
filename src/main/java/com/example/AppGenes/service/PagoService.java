package com.example.AppGenes.service;

import org.springframework.stereotype.Service;
import com.example.AppGenes.dto.PagoRequestDTO;
import com.example.AppGenes.dto.PagoResponseDTO;
import com.example.AppGenes.interfaces.PagoClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagoService {

    private final PagoClient pagoClient;

    public PagoResponseDTO pago(PagoRequestDTO pago) {
        return pagoClient.pago(pago);
    }
    
}
