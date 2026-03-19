package com.example.AppGenes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AppGenes.dto.ConsultaRequestDTO;
import com.example.AppGenes.dto.ConsultaResponseDTO;
import com.example.AppGenes.service.ConsultasService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/consulta")
@RequiredArgsConstructor
public class ConsultaController {
    
    private final ConsultasService consultaService;

    @PostMapping
    public ConsultaResponseDTO Consultar(@RequestBody ConsultaRequestDTO consulta) {
        return consultaService.consultar(consulta);
    }
}
