package com.example.AppGenes.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AppGenes.dto.PagoRequestDTO;
import com.example.AppGenes.dto.PagoResponseDTO;
import com.example.AppGenes.interfaces.PagoClient;
import com.example.AppGenes.models.logpagos;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagoService {

    private final PagoClient pagoClient;
    @Autowired
    private LogPagosService logPagosService; // inyectas el servicio

    public PagoResponseDTO pago(PagoRequestDTO pago) {
        procesarPago(pago.strPin, pago.strIdentificador01, pago.strIdentificador02, pago.strIdentificador03, pago.dblCashAmount);
        return pagoClient.pago(pago);
    }

    public void procesarPago(String ref, String id01, String id02, String id03, double monto) {

        logpagos pago = new logpagos();
        pago.setPingRef(ref);
        pago.setId01(id01);
        pago.setId02(id02);
        pago.setId03(id03);
        pago.setFecha(LocalDate.now());
        pago.setMonto(monto);

        logPagosService.guardar(pago);
    }
    
}
