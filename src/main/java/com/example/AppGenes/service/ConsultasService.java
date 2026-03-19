package com.example.AppGenes.service;

import org.springframework.stereotype.Service;

import com.example.AppGenes.dto.ConsultaRequestDTO;
import com.example.AppGenes.dto.ConsultaResponseDTO;
import com.example.AppGenes.interfaces.ConsultasClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConsultasService {

    private final ConsultasClient consultaClient;

    public ConsultaResponseDTO consultar(ConsultaRequestDTO consulta) {
        return consultaClient.consultar(consulta);
    }
    
}
