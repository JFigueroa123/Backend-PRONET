package com.example.AppGenes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AppGenes.models.logpagos;
import com.example.AppGenes.repository.logPagosRepository;

@Service
public class LogPagosService {

    @Autowired
    private logPagosRepository repositorio;

    public logpagos guardar(logpagos pagoDto) {
        return repositorio.save(pagoDto);
    }
}