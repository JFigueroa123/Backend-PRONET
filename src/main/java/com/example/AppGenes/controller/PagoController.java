package com.example.AppGenes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.AppGenes.dto.PagoRequestDTO;
import com.example.AppGenes.dto.PagoResponseDTO;
import com.example.AppGenes.service.PagoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/pago")
@RequiredArgsConstructor
public class PagoController {
    
    private final PagoService pagoService;

    @PostMapping
    public PagoResponseDTO Pago(@RequestBody PagoRequestDTO pago) {
        return pagoService.pago(pago);
    }
}
